package cl.praxis.gestorbiblioteca1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="libros")

public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro", nullable = false, unique = true)
    private long id;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "autor", length = 100, nullable = true)
    private String autor;
    @Column(name = "anioPublicacion", length = 5, nullable = true)
    private String anioPublicacion;
}
