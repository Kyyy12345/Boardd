package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@GetMapping("/") // 현재 경로로 접근
	public String index(){
		return "index"; // 프론트엔드 웹페이지 jsp 파일명 반환
	}
	public String a() {
		return "";
	}
}
