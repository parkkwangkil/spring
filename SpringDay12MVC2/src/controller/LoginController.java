package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("loginform.do")
	public String loginForm() {

		// 컨트롤러 메소드의 반환형이 String인 경우
		// 반환 값이 view의 이름이 됨
		// 지금 login_form.jsp가 선택됨
		return "login_form";

	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value = "userId", defaultValue = "noname") String id,
			@RequestParam("userPw") String pw, int num) {
		System.out.println("num param값"+num);
		System.out.println("덧셈"+(num+1));
		
		ModelAndView mv = new ModelAndView();
		if (id.equals(pw)) {
			mv.setViewName("login_success");
			mv.addObject("msg", "login성공");
			mv.addObject("loginId", id);

		} else {
			mv.setViewName("login_error");
		}
		return mv;
	}
}
