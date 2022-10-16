package com.sh.marine.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;
    private String imgPath;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String imgPath){
        this.title = title;
        this.content = content;
        this.imgPath = imgPath;
    }
}
