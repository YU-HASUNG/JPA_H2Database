package com.example.Blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SampleArticle {

    @Id // 대표값을 지정
    @GeneratedValue // 1, 2, 3 ... 자동생성 어노테이션
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    public SampleArticle() {} // 기본생성자가 있어야 함

    public SampleArticle(Long id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "SampleArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
