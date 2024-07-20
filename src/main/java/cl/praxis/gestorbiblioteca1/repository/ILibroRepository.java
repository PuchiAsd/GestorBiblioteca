package cl.praxis.gestorbiblioteca1.repository;

import cl.praxis.gestorbiblioteca1.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {

}
