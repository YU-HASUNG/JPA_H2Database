package com.example.Blog.dto;

import com.example.Blog.entity.SampleArticle;

public class SampleArticleForm {

    private String title;
    private String content;

    public SampleArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "SampleArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public SampleArticle toEntity(){
        return new SampleArticle(null, title, content);
    }
}