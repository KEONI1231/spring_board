package com.spring_study1.spring_board1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @GetMapping("/board/write") //localhost:8080/board/wirte
    public String boardWriteForm() {

        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(@RequestParam("title") String title, @RequestParam("content") String content) {



        return "";
    }

}
