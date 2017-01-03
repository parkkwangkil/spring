package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import repository.fileDao;
import vo.Myfile;
import vo.UploadFile;

@Controller
public class FileController {
	@Autowired
	private fileDao dao;

	public void setDao(fileDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/fileList.do")
	public ModelAndView fileList() {
		ModelAndView mv = new ModelAndView("file_list");
		mv.addObject("fileList", dao.selectAllFile());
		return mv;
	}

	@RequestMapping("/uploadForm.do")
	public String uploadForm() {
		return "upload_form";
	}

	@RequestMapping(value = "/uploadFile.do", method = RequestMethod.POST)
	public ModelAndView upload(HttpServletRequest request, UploadFile uploadFile) {
		String savePath = request.getServletContext().getRealPath("img");

		File dir = new File(savePath);
		if (dir.exists() == false) {
			dir.mkdir();
		}
		for (MultipartFile f : uploadFile.getFileList()) {
			String savedName = savePath + "/" + f.getOriginalFilename() + new Random().nextInt(1000000);
			File savedFile = new File(savedName);

			try {
				f.transferTo(savedFile);

				Myfile myfile = new Myfile();
				myfile.setOriginalName(f.getOriginalFilename());
				myfile.setSavedPath(savedFile.getAbsolutePath());

				dao.insertFile(myfile);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}

		}
		ModelAndView mv = new ModelAndView("upload_result");
		mv.addObject("fileCount", uploadFile.getFileList().size());
		return mv;
	}

	@RequestMapping("/downloadFile.do")
	public void downloadFile(HttpServletResponse response, int fileNum) {
		Myfile myfile = dao.selectFile(fileNum);

		response.setContentType("application/octet-stream; charset=UTF-8");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + myfile.getOriginalName() + "\"");

		try {
			FileInputStream is = new FileInputStream(myfile.getSavedPath());

			ServletOutputStream os = response.getOutputStream();

			// byte[] buf = new byte[1024];
			int size = 0;

			while ((size = is.read()) != -1) {
				os.write(size);
			}

			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}