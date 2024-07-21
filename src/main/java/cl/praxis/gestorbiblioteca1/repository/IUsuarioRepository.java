package cl.praxis.gestorbiblioteca1.repository;

import cl.praxis.gestorbiblioteca1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {

}
