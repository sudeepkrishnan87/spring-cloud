package com.mytechexp.books.vo;

import com.mytechexp.books.entity.Book;
import com.mytechexp.books.entity.Library;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book_Library_VO {
    private Book books;
    private Library library;
}
