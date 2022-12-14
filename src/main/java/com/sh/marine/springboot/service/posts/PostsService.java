package com.sh.marine.springboot.service.posts;


import com.sh.marine.springboot.domain.posts.Posts;
import com.sh.marine.springboot.domain.posts.PostsRepository;
import com.sh.marine.springboot.web.dto.PostsListResponseDto;
import com.sh.marine.springboot.web.dto.PostsResponseDto;
import com.sh.marine.springboot.web.dto.PostsSaveRequestDto;
import com.sh.marine.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){

        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){

        Posts posts = postsRepository.findById(id).orElseThrow(
                                                    () -> new IllegalArgumentException("해댱 게시글이 없습니다 id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent(), requestDto.getImgPath());

        return id;
    }

    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id).orElseThrow(
                                                    () -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }

    @Transactional()
    public List<PostsListResponseDto> findAllDesc(){
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }


}
