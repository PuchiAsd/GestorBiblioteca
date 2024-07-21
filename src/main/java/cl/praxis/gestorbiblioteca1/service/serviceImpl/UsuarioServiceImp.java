package cl.praxis.gestorbiblioteca1.service.serviceImpl;

import cl.praxis.gestorbiblioteca1.entity.Usuario;
import cl.praxis.gestorbiblioteca1.repository.IUsuarioRepository;
import cl.praxis.gestorbiblioteca1.service.IUsuarioService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service("usuarioServiceImp")
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public Usuario getUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuarioById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
