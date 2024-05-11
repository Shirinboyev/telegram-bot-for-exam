package uz.pdp.lesson.backend.service;

import uz.pdp.lesson.backend.model.Book;

import java.util.List;
public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(int id);

    void deleteBookById(int id);

    void saveBook(Book book);

}

