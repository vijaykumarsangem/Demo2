package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BooksService
{
@Autowired
 BooksRepository booksrepository;
public List<Books> getAllBooks(){
return booksrepository.findAll();
}
public Books getBookbyId(int id) 
{
	return booksrepository.findById(id).get();
}
public void saveOrUpdate(Books books) 
{
	booksrepository.save(books);
}
public void delete(int id) 
{
    booksrepository.deleteById(id);
}
public void update(Books books ,int bookid)
{
	booksrepository.save(books);
}
}
