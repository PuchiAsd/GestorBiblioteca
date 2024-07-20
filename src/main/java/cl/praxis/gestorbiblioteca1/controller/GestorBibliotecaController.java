package cl.praxis.gestorbiblioteca1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/gestorBiblioteca")
public class GestorBibliotecaController {
    public static final Logger LOGGER = LoggerFactory.getLogger(GestorBibliotecaController.class);

    @GetMapping("/logMessage")
    public String logMessage(){
        String message = "Mensaje de prueba";
        LOGGER.info("Hola Mundo " + message);

        String response = "Éxito " + message;
        return response;
    }


}
