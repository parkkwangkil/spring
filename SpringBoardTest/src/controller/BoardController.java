package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.BoardService;
import service.MemberService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardservice;

	public void setBoardservice(BoardService boardservice) {
		this.boardservice = boardservice;
	}
	
	@RequestMapping("/boardList.do")
	public ModelAndView boardList(@RequestParam(value="page",defaultValue="1")int page){
		ModelAndView mv = new ModelAndView("boardList");
		mv.addObject("articlePage",boardservice.makePage(page));
		
		return mv;
		
	
	
		
	}
}