package org.accenture.model.dao.test;

import org.accenture.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by antonio on 02/03/17.
 */
public class BooksRepositoryTest extends PersistenceContextTest {

   /* @Test
    public void count(){

        long numberBooks = bookRepository.count();
        Assert.assertTrue(numberBooks > 0);
    }*/

    @Test
    public void findAllBooks(){
        List<Book> books = bookRepository.findAll();
        Assert.assertFalse(books.isEmpty());
    }
    /*
    @Test
    public void findByTitle(){
        String titleExpected = "Java";
        List<Book> books = bookRepository.findByTitleLike(titleExpected);
        String titleActual = books.get(0).getTitle();
        Assert.assertTrue(titleActual.contains(titleExpected));
    }*/
}
