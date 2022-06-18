package com.chaitanya.springboot.k1.payloads;

import com.chaitanya.springboot.k1.entities.Category;

import java.util.Date;

public class PostDto {
    private String title;
    private String content;
    private String user;
    private String imageName;
    private Date addedDate;
    private Category category;
}
