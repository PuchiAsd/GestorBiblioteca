package cl.praxis.gestorbiblioteca1.service;

import cl.praxis.gestorbiblioteca1.entity.Libro;

import java.util.List;

public interface ILibroService {
    Libro getLibro(Long id);
    List<Libro> getAllLibros();
    Libro saveLibro(Libro libro);
    Libro updateLibro(Libro libro);
    void deleteLibroById(Long id);
    void deleteLibro(Libro libro);

}
