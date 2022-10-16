package com.sh.marine.springboot.web.dto;

import com.sh.marine.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String imgPath;
    private  String author;

    public PostsResponseDto(Posts posts){
        this.id = posts.getId();;
        this.title = posts.getTitle();;
        this.content = posts.getContent();
        this.author = posts.getAuthor();
        this.imgPath = posts.getImgPath();
    }
}
