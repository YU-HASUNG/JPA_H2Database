package com.example.Blog.controller;

import com.example.Blog.dto.SampleArticleForm;
import com.example.Blog.entity.SampleArticle;
import com.example.Blog.repository.SampleArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleArticleController {

    @Autowired // SpringBoot가 미리 생성해 놓은 객체를 가져다가 자동으로 연결
    private SampleArticleRepository saRepository;

    @GetMapping("/sampleArticle/article")
    public String newArticleForm(){

        return "sampleArticle/sampleArticle";
    }

    @PostMapping("/articles/create")
    public String createArticle(SampleArticleForm form){
        System.out.println(form.toString());

        // 1. DTO를 Entity로 변환
        SampleArticle sa = form.toEntity();
        System.out.println(sa.toString());

        // 2. Repository에 Entity를 DB안에 저장하게 함
        SampleArticle saved = saRepository.save(sa);
        System.out.println(saved.toString());

        return "";
    }
}
