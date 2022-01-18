package com.human.ncs7;

import java.util.ArrayList;

public interface Ibbs {
	ArrayList<Post> getList();
	Post getView(int id); //id 값을 받아서 id값에 맞는 Post 클래스를 리턴
	void writePost(String title,String name, String content);
	
}
