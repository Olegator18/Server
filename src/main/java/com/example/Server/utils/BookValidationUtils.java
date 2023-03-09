package com.example.Server.utils;

import com.example.Server.entity.BookEntity;
import com.example.Server.exception.ValidationExceptionBook;



public class BookValidationUtils {
    public static void validationBook(BookEntity book) throws ValidationExceptionBook {
        String bookStringTitle = book.getTitle();
        if (bookStringTitle == null || bookStringTitle.isBlank() || !bookStringTitle.matches("[\\sA-ZА-Яa-za-я0-9]{1,100}")) {
            throw new ValidationExceptionBook("Неверно введено название книги." +
                    "Минимальное кол-во символов в названии - 2, максимальное - 30");
        }
        String bookStringAuthor = book.getAuthor();
        if (bookStringAuthor == null || bookStringAuthor.isBlank() || !bookStringAuthor.matches("[\\sA-ZА-Яa-za-я0-9]{1,100}"))
        {
            throw new ValidationExceptionBook("Неверно введено имя Автора." +
                    "Минимальное кол-во символов в имени - 1, максимальное - 100");
        }
        String bookStringPublishing = book.getKind();
        if (bookStringPublishing == null || bookStringPublishing.isBlank() || !bookStringPublishing.matches("[\\sA-ZА-Яa-za-я0-9]{1,100}"))
        {
            throw new ValidationExceptionBook("Неверно введено название издательства." +
                    "Минимальное кол-во символов в названии издательства - 3,максимальное - 30");
        }
        String bookStringKind = book.getAuthor();
        if (bookStringKind == null || bookStringKind.isBlank() || !bookStringKind.matches("[\\sA-ZА-Яa-za-я0-9]{1,100}"))
        {
            throw new ValidationExceptionBook("Неверно введено название жанра." +
                    "Минимальное кол-во символов в названии жанра - 4, максимальное - 30");
        }
        String bookIntYear = String.valueOf(book.getYear());
        if ( bookIntYear == null ||  bookIntYear.isBlank() || !bookIntYear.matches("[\\d0-9]{3,4}"))
        {
            throw new ValidationExceptionBook("Неверно введено год издательства книги." +
                    "Минимальное кол-во символов в году книги - 3, максимальное - 4");
        }
    }


}

