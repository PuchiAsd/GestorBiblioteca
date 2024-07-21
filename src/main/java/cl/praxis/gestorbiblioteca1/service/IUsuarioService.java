package cl.praxis.gestorbiblioteca1.service;

import cl.praxis.gestorbiblioteca1.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario getUsuario(Long id);
    List<Usuario> getAllUsuarios();
    Usuario saveUsuario(Usuario usuario);
    Usuario updateUsuario(Usuario usuario);
    void deleteUsuarioById(Long id);
}
