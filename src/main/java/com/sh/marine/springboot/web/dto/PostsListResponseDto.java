package com.sh.marine.springboot.web.dto;

import com.sh.marine.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private  String title;
    private String imgPath;
    private  String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.imgPath = entity.getImgPath();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
