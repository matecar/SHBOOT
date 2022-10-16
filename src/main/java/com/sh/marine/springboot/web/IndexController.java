package com.sh.marine.springboot.web;

import com.sh.marine.springboot.service.posts.PostsService;
import com.sh.marine.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(){
        return "main";
    }

    @GetMapping("/main")
    public String Main(){
        return "main";
    }

    @GetMapping("/contactUs")
    public String ContactUs(){
        return "contactUs";
    }

    @GetMapping("/dryDiv")
    public String DryDiv(){
        return "dryDiv";
    }

    @GetMapping("/iceDiv")
    public String IceDiv(){
        return "iceDiv";
    }

    @GetMapping("/introCompany")
    public String IntroCompany(){
        return "introCompany";
    }

    @GetMapping("/notice")
    public String Notice(){
        return "notice";
    }

    @GetMapping("/productList")
    public String ProcutList(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "productList";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
