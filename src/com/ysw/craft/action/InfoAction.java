package com.ysw.craft.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.ysw.craft.pojos.Comment;
//json-plugin的一种返回json格式的尝试，但是未果，先放在这
public class InfoAction extends ActionSupport{
	
	    private static final long serialVersionUID = 1359090410097337654L;

	    private List<Comment> comments = new ArrayList<Comment>();
	    //没getter and setter方法的属性不会被串行化到JSON
	    @SuppressWarnings("unused")
	    private String title;
	    //！！！使用transient修饰的属性也会被串行化到JSON
	    private transient String content;

	    public String loadInfo() {
	        title="123木头人";
	        content="你是木头人，哈哈。";
	        loadComments();
	        return "success";
	    }

	    /**
	     * 加载留言信息
	     */
	    private void loadComments() {
	        Comment com1 = new Comment();
	        com1.setContent("很不错嘛");
	        com1.setId(1);
	        com1.setNickname("纳尼");
	        Comment com2 = new Comment();
	        com2.setContent("哟西哟西");
	        com2.setId(2);
	        com2.setNickname("小强");
	        comments.add(com1);
	        comments.add(com2);
	    }

	    public List<Comment> getComments() {
	        return comments;
	    }

	    public void setComments(List<Comment> comments) {
	        this.comments = comments;
	    }

	    public static long getSerialversionuid() {
	        return serialVersionUID;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

}
