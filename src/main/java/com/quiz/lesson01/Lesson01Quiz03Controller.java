package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson01/quiz03")
@Controller 
public class Lesson01Quiz03Controller {

	@RequestMapping("/1")
	public String quiz03() {
		return "lesson01/quiz03";
	}
}
