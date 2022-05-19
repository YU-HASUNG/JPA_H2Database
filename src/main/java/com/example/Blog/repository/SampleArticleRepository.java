package com.example.Blog.repository;

import com.example.Blog.entity.SampleArticle;
import org.springframework.data.repository.CrudRepository;

public interface SampleArticleRepository extends CrudRepository<SampleArticle, Long> {
}
