package com.ysw.craft.pojos;

public class Comment {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String nickname;
	private String content;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		nickname = nickname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		content = content;
	}
	public Comment(){
		
	}
	public Comment(String nickname,String content){
		this.nickname=nickname;
		this.content=content;
	}
}
