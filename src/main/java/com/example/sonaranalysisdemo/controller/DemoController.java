package com.example.sonaranalysisdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        try {
            // Generar el saludo con la lógica optimizada
            return generateGreeting(name);
        } catch (Exception e) {
            // Manejo adecuado de excepciones
            return "An error occurred while processing the request.";
        }
    }

    private String generateGreeting(String name) {
        // Inicializamos el saludo por defecto
        String greeting = "Hello, " + name;

        // Saludo especial para 'admin'
        if (name.equalsIgnoreCase("admin")) {
            greeting = "Welcome, Admin!";
        }
        // Limitar el nombre a los primeros 10 caracteres si es necesario
        else if (name.length() > 10) {
            greeting = "Hello, " + name.substring(0, 10);
        }

        // Agregar signos de exclamación al saludo
        greeting = appendExclamationMarks(greeting);
        return greeting;
    }


    private String appendExclamationMarks(String greeting) {
        StringBuilder stringBuilder = new StringBuilder(greeting);
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("!");
        }
        return stringBuilder.toString();
    }

    @GetMapping("/unused")
    public String unused() {
        // Método no utilizado, pero documentado aquí.
        return "This method is not used.";
    }
}
