package com.book.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.book.dao.BookDao;
import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;

public class BookServiceImpl implements BookService{
	BookDaoImpl dao=new BookDaoImpl();

	
	public void add() {
		
		Book book1=new Book("asd",677);
		Book book2=new Book("jg",765);
		
		dao.add(book1);
		dao.add(book2);
		
	}

	@Override
	public void deleteItems(Book book) {
	
		dao.deleteItems(book);
	}

	@Override
	public Collection <Book> display() {
	return dao.display();
	}


@Override
public void addtocart(String bookname, int price) {
	dao.addtocart(bookname,price);

	
}

@Override
public Collection<Integer> displaycart() {
	
	return dao.displaycart();
}

	
	
		

}
