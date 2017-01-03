package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.BoardService;
import vo.Article;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardservice;

	public void setBoardservice(BoardService boardservice) {
		this.boardservice = boardservice;
	}

	@RequestMapping("/boardList.do")
	public ModelAndView boardList(@RequestParam(value = "page", defaultValue = "1") int page) {
		ModelAndView mv = new ModelAndView("boardList");
		mv.addObject("articlePage", boardservice.makePage(page));
		return mv;
	}

	@RequestMapping("/writeForm.do")
	public String writeForm(HttpSession session) {
		if (session.getAttribute("loginId") != null) {
			return "write_form"; // 로그인 정보 유
		} else {
			return "login_form"; // 로그인 정보 무
		}
	}

	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public ModelAndView write(HttpSession session, Article article) {
		String writer = (String) session.getAttribute("loginId");
		article.setWriter(writer);
		ModelAndView mv = new ModelAndView("write_result");
		mv.addObject("articleNum", boardservice.write(article));
		return mv;
	}

	@RequestMapping("read.do")
	public ModelAndView read(HttpSession session, int articleNum) {
		String loginId = (String) session.getAttribute("loginId");
		Article article = boardservice.read(articleNum, loginId);
		ModelAndView mv = new ModelAndView("read");
		mv.addObject("article", article);
		return mv;
	}
}