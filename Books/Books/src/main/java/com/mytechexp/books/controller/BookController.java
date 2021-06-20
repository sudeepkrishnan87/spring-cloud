package com.mytechexp.books.controller;

import com.mytechexp.books.entity.Book;
import com.mytechexp.books.service.BookService;
import com.mytechexp.books.vo.Book_Library_VO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@Log4j2
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public Book creatBook(@RequestBody Book book)
    {
        return bookService.createBookService(book);

    }
    @GetMapping("/{bookid}")
    public Book_Library_VO searchBooks(@PathVariable long bookid)
    {

        return bookService.searchByBookId(bookid);
    }
}
