package com.sh.marine.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(length = 1000, nullable = true)
    private  String imgPath;

    private  String author;

    @Builder
    public Posts(String title, String content, String author, String imgPath){
        this.title = title;
        this.content = content;
        this.author = author;
        this.imgPath = imgPath;
    }

    public void update(String title, String content, String imgPath){
        this.title = title;
        this.content = content;
        this.imgPath = imgPath;
    }
}
