package com.example.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.example.demo.domain.Article;
import com.example.demo.service.ArticleService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController//相当于@Controller+@ResponseBody
@CrossOrigin
public class ArticleController {
	@Resource
	private ArticleService articleService;

	@RequestMapping("/selectArticle")
	public Article selectUser(String article_name){
		return articleService.findArticleByName(article_name);
	}
	@PostMapping("/insertArticle")
	public int insertArticle(HttpServletRequest request){
		if(articleService.findArticleByName(request.getParameter("article_name"))==null) {		
			Article article=new Article();
			article.setArticle(request.getParameter("article"));
			article.setArticle_name(request.getParameter("article_name"));
			article.setArticle_intro(request.getParameter("article_intro"));
			article.setTag1(request.getParameter("tag1").toString());
			article.setTag2(request.getParameter("tag2").toString());
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			article.setDate(dateFormat.format(date));
			String name=request.getParameter("userName");
					//request.getSession().getAttribute("userName").toString();
			article.setAuthor(name);
			return articleService.addArticle(article);
		
		}
		return -1;
	}	
	@RequestMapping(value="/findAll")
	public List<Article> findAll() {
		return articleService.findAll();
	}
	@PostMapping(value="/testUpload")  
	     public void testUploadFile(HttpServletRequest req,MultipartHttpServletRequest multiReq) throws IOException{  
	        FileOutputStream fos=new FileOutputStream(new File("/static/upload/"));  
	        FileInputStream fs=(FileInputStream) multiReq.getFile("file").getInputStream();  
	        byte[] buffer=new byte[1024];  
	        int len=0;  
	        while((len=fs.read(buffer))!=-1){  
	           fos.write(buffer, 0, len);  
	       }  
	        fos.close();  
	        fs.close();  
	    }
}
