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

		// ��Ʈ�ѷ� �޼ҵ��� ��ȯ���� String�� ���
		// ��ȯ ���� view�� �̸��� ��
		// ���� login_form.jsp�� ���õ�
		return "login_form";

	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value = "userId", defaultValue = "noname") String id,
			@RequestParam("userPw") String pw, int num) {
		System.out.println("num param��"+num);
		System.out.println("����"+(num+1));
		
		ModelAndView mv = new ModelAndView();
		if (id.equals(pw)) {
			mv.setViewName("login_success");
			mv.addObject("msg", "login����");
			mv.addObject("loginId", id);

		} else {
			mv.setViewName("login_error");
		}
		return mv;
	}
}
