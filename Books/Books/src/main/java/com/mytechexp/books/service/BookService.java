package com.mytechexp.books.service;

import com.mytechexp.books.entity.Book;
import com.mytechexp.books.entity.Library;
import com.mytechexp.books.repo.BookRepo;
import com.mytechexp.books.vo.Book_Library_VO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Log4j2
public class BookService {
    @Autowired
    private BookRepo repo;
    @Autowired
    private RestTemplate restTemplate;

    public Book createBookService(Book book)
    {
        log.info("Entering in to create book Services");
        return repo.save(book);
    }

    public Book_Library_VO searchByBookId(long bookid) {
        log.info("Entring to the search Bookid service");
        Book_Library_VO vo=new Book_Library_VO();
        Optional<Book> book= repo.findById(bookid);
        if(book.isPresent())
        {
        Library library=restTemplate.getForObject("http://LIBRARY-SERVICE/library/"+book.get().getLibrary_Id(),Library.class);


            vo.setBooks(book.get());
            vo.setLibrary(library);
        }


return vo;

    }
}
