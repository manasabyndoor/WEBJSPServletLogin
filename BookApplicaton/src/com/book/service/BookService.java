package com.book.service;

import java.util.Collection;

import com.book.pojo.Book;

public interface BookService {

	public void deleteItems(Book book);
	public Collection <Book> display();
	public void add();
	public void addtocart(String bookname, int price);
	public Collection<Integer> displaycart();



}
