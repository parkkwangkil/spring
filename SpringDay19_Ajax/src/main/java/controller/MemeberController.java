package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.MemberService;

@Controller
public class MemeberController {
	@Autowired
	private MemberService service;

	public void setService(MemberService service) {
		this.service = service;
	}

	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "join_form";
	}

	@RequestMapping("/idCheck.do")
	@ResponseBody
	public String idCheck(String id) {
		boolean result = service.idCheck(id);
		return result + "";
	}
}