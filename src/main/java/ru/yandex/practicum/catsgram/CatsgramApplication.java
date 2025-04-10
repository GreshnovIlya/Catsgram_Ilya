package ru.yandex.practicum.catsgram;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatsgramApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatsgramApplication.class, args);
    }
}