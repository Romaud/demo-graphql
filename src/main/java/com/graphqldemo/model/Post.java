package com.graphqldemo.model;

import lombok.Builder;

@Builder
public class Post {
    private int id;
    private String title;
    private String category;
    private int authorId;
}
