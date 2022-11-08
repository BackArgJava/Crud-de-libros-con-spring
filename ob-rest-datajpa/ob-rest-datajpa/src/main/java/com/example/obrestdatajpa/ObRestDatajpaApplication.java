package com.example.obrestdatajpa;


import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;


@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		 BookRepository repository=context.getBean(BookRepository.class);

		 //Creamos el crud
		//crear libro
		 Book book1 = new Book(null, "Harry potter", "J.K Rowling", 300, 2500, LocalDate.of(1997,6,26),true);
		 Book book2 = new Book(null, "Harry potter2", "J.K Rowling", 300, 2500, LocalDate.of(1997,6,26),true);


		//almacenar un libro
		System.out.println("Numeros de libros en base de datos: "  + repository.findAll().size());
		repository.save(book1);
		repository.save(book2);

		//recuperar todos los libros

		System.out.println("Numeros de libros en base de datos: "  + repository.findAll().size());
		System.out.println(book1.getPrice());

		// borar un libro
       // repository.deleteById(1L);

		System.out.println("Numeros de libros en base de datos: "  +repository.findAll().size());
	}

}
