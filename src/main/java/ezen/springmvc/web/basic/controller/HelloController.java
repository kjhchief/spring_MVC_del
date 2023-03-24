package ezen.springmvc.web.basic.controller;

import javax.servlet.RequestDispatcher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// hello.do 요청에 대한 세부 컨트롤러. 프론트 컨트롤러가 얘를 자동으로 호출한다. 
@Controller
public class HelloController {
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		String message = "안녕하세요. Spring MVC";
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", message);
		mav.setViewName("hello");
		return mav;
	}
}
