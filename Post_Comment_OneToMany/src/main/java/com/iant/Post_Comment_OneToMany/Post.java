package com.iant.Post_Comment_OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Post {
	@Id
	private int Post_Id;
	
	private String Post_Name;
	
	@OneToMany(mappedBy = "post")
	List<Comments> com;

	public int getPost_Id() {
		return Post_Id;
	}

	public void setPost_Id(int post_Id) {
		Post_Id = post_Id;
	}

	public String getPost_Name() {
		return Post_Name;
	}

	public void setPost_Name(String post_Name) {
		Post_Name = post_Name;
	}

	public List<Comments> getCom() {
		return com;
	}

	public void setCom(List<Comments> com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "Post [Post_Id=" + Post_Id + ", Post_Name=" + Post_Name + ", com=" + com + "]";
	}

	public Post(int post_Id, String post_Name, List<Comments> com) {
		super();
		Post_Id = post_Id;
		Post_Name = post_Name;
		this.com = com;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
