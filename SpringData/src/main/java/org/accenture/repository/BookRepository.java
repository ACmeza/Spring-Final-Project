package org.accenture.repository;

import org.accenture.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
   // public List<Book> findByTitleLike(String nombre);

}
