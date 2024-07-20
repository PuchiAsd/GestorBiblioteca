package cl.praxis.gestorbiblioteca1.service.serviceImpl;

import cl.praxis.gestorbiblioteca1.entity.Libro;
import cl.praxis.gestorbiblioteca1.repository.ILibroRepository;
import cl.praxis.gestorbiblioteca1.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("libroServiceImp")
public class LibroServiceImp implements ILibroService{

    @Autowired
    private ILibroRepository libroRepository;

    @Override
    public Libro getLibro(Long id){
        Libro libro = libroRepository.findById(id).orElse(null);
        return libro;
    }
    @Override
    public List<Libro> getAllLibros(){
        List<Libro> libros = libroRepository.findAll();
        return libros;
    }

    @Override
    public Libro saveLibro(Libro libro){
        Libro libroGuardado = libroRepository.save(libro);
        return libroGuardado;
    }
    @Override
    public Libro updateLibro(Libro libro){
        Libro libroUpdate = libroRepository.save(libro);
        return libroUpdate;
    }
    @Override
    public void deleteLibroById(Long id){
        libroRepository.deleteById(id);
    }

    @Override
    public void deleteLibro(Libro libro){
        libroRepository.delete(libro);
    }
}
