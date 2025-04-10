package ru.yandex.practicum.catsgram.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = { "email" })
@RequiredArgsConstructor
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Instant registrationDate;
}
