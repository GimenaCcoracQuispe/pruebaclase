package com.example.sonaranalysisdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    // Error 4: Código duplicado
    public String processData(String data) {
        return processAndFormatData(data, "Processed");
    }

    public String duplicateMethod(String data) {
        return processAndFormatData(data, "Duplicated");
    }

    private String processAndFormatData(String data, String type) {
        String result = data.trim().toUpperCase();
        return result + " - " + type + "!";
    }

}
