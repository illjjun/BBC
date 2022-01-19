package com.human.ncs7;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BBS {
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/list")
	public String list(Model model) {
		Ibbs bbs=sqlSession.getMapper(Ibbs.class);
		ArrayList<Post> alPost=bbs.getList();
		model.addAttribute("alPost",alPost);
		System.out.println("record count: "+alPost.size());
		return "list";
	}
	
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String write(HttpServletRequest hsr){
		String title=hsr.getParameter("title");
		String name=hsr.getParameter("name");
		String content=hsr.getParameter("content");
		
		Ibbs bbs=sqlSession.getMapper(Ibbs.class);
		bbs.writePost(title,name,content);
		return "redirect:/list";
	}
	
	@RequestMapping("/view")
	public String view(HttpServletRequest hsr, Model model) {
		int id=Integer.parseInt(hsr.getParameter("id"));
		
		Ibbs bbs=sqlSession.getMapper(Ibbs.class);
		bbs.plusHit(id);//조회수 증가
		Post post=bbs.getView(id); //게시물 내용 가져오기
		model.addAttribute("post",post);
		return "view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest hsr) {
		int post_id=Integer.parseInt(hsr.getParameter("id"));
		
		Ibbs bbs=sqlSession.getMapper(Ibbs.class);
		bbs.deletePost(post_id);
		
		return "redirect:/list";
	}
	@RequestMapping("/update")
	public String update(HttpServletRequest hsr,Model model) {
		int id=Integer.parseInt(hsr.getParameter("id"));

		
		Ibbs bbs=sqlSession.getMapper(Ibbs.class); //sql이 어디에있는지 찾음
		Post post=bbs.getView(id); //그 아이디에 있는값 꺼내옴
		model.addAttribute("post",post); 
		return "update";

		
	}
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modify(HttpServletRequest hsr,Model model) {
		int id=Integer.parseInt(hsr.getParameter("post_id"));
		String title=hsr.getParameter("title");
		String name=hsr.getParameter("name");
		String content=hsr.getParameter("content");
		
		Ibbs bbs=sqlSession.getMapper(Ibbs.class); //sql이 어디에있는지 찾음
		bbs.modifyPost(id,title,name,content);
		return "redirect:/list";
	}
	@RequestMapping("/compose")
	public String compose() {
		return "write";
	}
}
