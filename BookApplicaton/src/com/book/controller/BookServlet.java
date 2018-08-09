package com.book.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.pojo.Book;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;

@WebServlet("*.app")
public class BookServlet extends HttpServlet {

	/**
	 * 
	 */
	static int count;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		switch (action) {
		case "/addtocart.app":
			String bookname = request.getParameter("bookName");
			int price = Integer.parseInt(request.getParameter("price"));
			// BookService service = new BookServiceImpl();
			// service.addtocart(bookname,price);
			count = count + 1;
			System.out.println(bookname);
			System.out.println(count);
			response.sendRedirect("addedtocart.jsp");
			break;
		case "/cart.app":
			if (count == 0)

				response.sendRedirect("nocart.jsp");
			/*
			 * else { Collection<Integer>list=service.displaycart();
			 * request.setAttribute("Book",list); System.out.println(count);
			 * RequestDispatcher requestdispatcher =
			 * request.getRequestDispatcher("itemsincart.jsp");
			 * requestdispatcher.forward(request, response);
			 * 
			 * response.sendRedirect("itemsincart.jsp"); break; }
			 */
			break;
		case "/refresh.app":
			BookService service = new BookServiceImpl();
			service.add();
			Collection<Book> book = service.display();
			request.setAttribute("Book", book);
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("home.jsp");
			requestdispatcher.forward(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
