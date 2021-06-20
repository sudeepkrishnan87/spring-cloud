package com.mytechexp.books.repo;

import com.mytechexp.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
