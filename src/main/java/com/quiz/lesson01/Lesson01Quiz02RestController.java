package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController // @Controller + @ResponseBody
public class Lesson01Quiz02RestController {
	// @ResponseBody + return String => HttpMessageConverter	String => response에 글자로 담긴다. text/html
	// @ResponseBody + return 객체 => HttpMessageConverter  jackson 라이브러리 => JSON String 응답에 담긴다. application/json
	
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> result = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "봉준호");
		map.put("time", 131);
		map.put("title", "기생충");
		result.add(map);
		
		map = new HashMap<>();
		map.put("rate", 0);
		map.put("director", "로베르도 베니니");
		map.put("time", 166);
		map.put("title", "인생은 아름다워");
		result.add(map);
		
		map = new HashMap<>();
		map.put("rate", 12);
		map.put("director", "크리스토퍼 놀란");
		map.put("time", 147);
		map.put("title", "인셉션");
		result.add(map);
		
		map = new HashMap<>();
		map.put("rate", 19);
		map.put("director", "윤종빈");
		map.put("time", 133);
		map.put("title", "범죄와의 전쟁: 나쁜놈들 전성시대");
		result.add(map);
		
		map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "프렌시스 로렌스");
		map.put("time", 137);
		map.put("title", "헝거게임");
		result.add(map);
		
		return result;
	}
	
	@RequestMapping("/2")
	public List<Board> quiz02_2() {
		List<Board> result = new ArrayList<>();
		
		Board board = new Board();
		
		board.setTitle("안녕하세요. 가입인사 드립니다");
		board.setUser("hagulu");
		board.setContent("안녕하세요 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		result.add(board);
		
		board = new Board();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일이었어.. 금요일인줄");
		result.add(board);
		
		board = new Board();
		board.setTitle("오늘 데이트 한 이야기 들려드릴게요.");
		board.setUser("dulumary");
		board.setContent("...");
		result.add(board);
		
		return result;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Board> quiz02_3() {
		Board board = new Board();
		board.setTitle("안녕하세요. 가입인사 드립니다");
		board.setUser("hagulu");
		board.setContent("안녕하세요 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		
		return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
