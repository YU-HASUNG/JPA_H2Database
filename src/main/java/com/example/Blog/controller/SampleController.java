package com.example.Blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String sampleFirst(Model model) {
        model.addAttribute("name", "홍길동");
        return "sample"; // 브라우저로 전송
    }
}
