package cl.praxis.gestorbiblioteca1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false,unique = true)
    private long id;
    @Column(name= "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name= "apellido", length = 100,nullable = false)
    private String apellido;
    @Column(name= "edad", length = 100,nullable = false)
    private String edad;
    @Column(name= "correo",length = 100,nullable = false)
    private String correo;
    @Column(name= "contraseña", length = 100,nullable = false)
    private String contraseña;

}
