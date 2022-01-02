package com.my.soap.web.service.soap.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private int id;
    private String name;
    private String description;
}
