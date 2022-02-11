package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BooksController
{
	@Autowired
 	BooksService booksservice;
	@GetMapping("/bookget")
	private List<Books> getAllBooks()
	{
		return booksservice.getAllBooks();
		
	}
	@GetMapping("/bookgett/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid)
	{
		return booksservice.getBookbyId(bookid);
		
	}
	@PostMapping("/bookpost")
    private int saveBooks(@RequestBody Books books) 
    {
    	booksservice.saveOrUpdate(books);
		return books.getBookid();
    }
	@PutMapping("/bookput")
	private Books Update(@RequestBody Books books) 
	{
		booksservice.saveOrUpdate(books);
		return books;
		
	}
	@DeleteMapping("/bookdelete/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	booksservice.delete(bookid);  
	} 
}
