package org.accenture.web.controller;

import org.accenture.model.Book;
import org.accenture.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonio.meza.flores on 3/7/2017.
 */
@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    @RequestMapping(value = "/books")
    public String getBooks(Model model) {

        List<Book> books = bookService.findAll();
        model.addAttribute("books",books);
        return "book";
    }


    @GetMapping("/addbook")
    public String addBook(Model model){
        model.addAttribute("book",new Book());
        return "addbook";
    }

    @PostMapping("/addbook")
    public String saveBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/books";
    }
}
