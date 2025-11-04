package tech.hamidou.sa_analysis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.hamidou.sa_analysis.records.Sa;

import java.util.List;


@RestController
@RequestMapping(path = "/sa", produces = "application/json")
public class SaController {

    @GetMapping
    public List<Object> search(String keyword) {
        return List.of(new Sa(1,"Une excellente formation sur Spring Boot",0),
                new Sa(2,"Très mauvaise expérience, je ne recommande pas",1),
                new Sa(3,"Formation correcte mais pourrait être améliorée",0));
    }
}
