package com.example.springbootexperiments.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Book {

    private long id;
    private String name;
    private String author;

}
