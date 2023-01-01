package com.example.homework3_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String helloweb(){
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String learning(){
        return "Имя ученика: Костя. Название проекта: HomeWork3_2. Дата создания: 01.01.2023. Описание: проработка гет запросов.";
    }
}
