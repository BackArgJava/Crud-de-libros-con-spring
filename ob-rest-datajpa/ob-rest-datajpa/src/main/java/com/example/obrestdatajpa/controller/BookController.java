package com.example.obrestdatajpa.controller;

//Controlador (Controller): Este componente es el que responde a la interacción
// (eventos) que hace el usuario en la interfaz y realiza las peticiones al modelo para pasar estos a la vista.
import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class BookController {

    //atributos

    private BookRepository bookRepository;

    //constructores

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //crud sobre la entidad book

// buscar todos los libros (lista de libros)
/**
* http://localhost:8080/    api/books
*
*/
@GetMapping("/api/books")

public  List<Book> findAll() {
// recuperar y devolver  los libros de base de datos
        return bookRepository.findAll();
}
//buscar un solo libro en base de datos segun su id

    

    //crea

}
