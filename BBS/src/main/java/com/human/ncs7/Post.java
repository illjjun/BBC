package com.human.ncs7;

public class Post {
	private int id;
	private String name;
	private String title;
	private String content;
	private String created;
	private String hit;
	private String kind;
	private String stop;
	private String indent;
	
	public Post(int id, String name, String title, String content, String created, String hit, String kind, String stop,
			String indent) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.created = created;
		this.hit = hit;
		this.kind = kind;
		this.stop = stop;
		this.indent = indent;
	}
	public Post() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
	public String getIndent() {
		return indent;
	}
	public void setIndent(String indent) {
		this.indent = indent;
	}

	
}
