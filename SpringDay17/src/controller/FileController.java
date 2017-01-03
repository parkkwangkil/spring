package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import vo.Book;
import vo.Movie;

@Controller
public class FileController {
	@RequestMapping("/uploadForm.do")
	public String uploadForm() {
		return "upload_form";

	}

	@RequestMapping(value = "upload.do", method = RequestMethod.POST)
	public ModelAndView upload(Book book) {
		ModelAndView mv = new ModelAndView("upload_result");
		String savePath = "c:/upload";
		File dir = new File(savePath);

		if (dir.exists() == false) {
			dir.mkdirs();
		}
		String savedName = savePath + "/" + book.getMyfile().getOriginalFilename() + new Random().nextInt(1000000);
		File savedFile = new File(savedName);

		try {
			// 클라이언트의 파일을 빈 파일에 업로드
			book.getMyfile().transferTo(savedFile);

			mv.addObject("originalName", book.getMyfile().getOriginalFilename());
			mv.addObject("savePath", savedName);
			mv.addObject("title", book.getTitle());
		} catch (IllegalStateException | IOException e) {
			System.out.println("업로드 잘 됨??");
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping("/download.do")
	public void download(HttpServletResponse response) {
		response.setContentType("application/octet-stream; charset=UTF-8");
		response.setHeader("Content-Disposition", "attachment; filename=\"1.jpg\"");

		try {
			FileInputStream is = new FileInputStream("c:/upload/1.jpg");

			ServletOutputStream os = response.getOutputStream();

			byte[] buf = new byte[1024];
			int size = 0;
			while ((size = is.read(buf)) != 0) {
				os.write(buf, 0, size);
			}
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("다운 잘 됨?");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("안됨");
			e.printStackTrace();
		}

	}

	@RequestMapping("/uploadFormMovie.do")
	public String uploadFormMovie() {
		return "upload_form_movie";

	}

	@RequestMapping(value = "/uploadFormMovie.do", method = RequestMethod.POST)
	public ModelAndView uploadMovie(Movie movie) {
		ModelAndView mv = new ModelAndView("upload_movie_result");

		String savePath = "c:/upload_movie";
		File dir = new File(savePath);
		if (dir.exists() == false) {
			dir.mkdir();
		}
		// 파일 여러개를 저장하는 반복문
		for (MultipartFile f : movie.getMyfile()) {
			String savedName = savePath + "/" + f.getOriginalFilename() + new Random().nextInt(1000000);
			File savedFile = new File(savedName);

			try {
				f.transferTo(savedFile);

				System.out.println("원래이름:" + f.getOriginalFilename());
				System.out.println("저장된이름:" + savedName);
				System.out.println("---------------");
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		mv.addObject("uploadedFileNames", movie.getMyfile());
		
		return mv;
	}
}