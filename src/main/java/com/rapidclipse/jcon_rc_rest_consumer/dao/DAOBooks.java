
package com.rapidclipse.jcon_rc_rest_consumer.dao;

import java.util.List;

import com.rapidclipse.jcon_rc_rest_consumer.domain.Book;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


public class DAOBooks
{
	public static List<Book> listBooks()
	{
		final Client client = ClientBuilder.newClient();

		final Response response = client.target("http://localhost:8086/books/list")
			.request(MediaType.APPLICATION_JSON)
			.get(Response.class);
		
		final List<Book> result = response.readEntity(new GenericType<List<Book>>()
		{});

		client.close();

		return result;
	}

	public static Book updateBook(final Book book)
	{
		final Client client = ClientBuilder.newClient();

		final Response response = client.target("http://localhost:8086/books/update")
			.request(MediaType.APPLICATION_JSON)
			.post(Entity.entity(book, MediaType.APPLICATION_JSON));
		
		final Book result = response.readEntity(Book.class);

		client.close();

		return result;
	}
	
	public static Book insertBook(final Book book)
	{
		final Client client = ClientBuilder.newClient();

		final Response response = client.target("http://localhost:8086/books/insert")
			.request(MediaType.APPLICATION_JSON)
			.post(Entity.entity(book, MediaType.APPLICATION_JSON));
		
		final Book result = response.readEntity(Book.class);

		client.close();

		return result;
	}
	
	public static void deleteBook(final Book book)
	{
		final Client client = ClientBuilder.newClient();

		client.target("http://localhost:8086/books/delete")
			.request(MediaType.APPLICATION_JSON)
			.post(Entity.entity(book, MediaType.APPLICATION_JSON));

		client.close();
	}
}
