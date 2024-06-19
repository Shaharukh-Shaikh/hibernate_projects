package com.iant.Post_Comment_OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comments {
	@Id
	private int com_Id;
	
	private String Com_Name;
	
	@ManyToOne
	private Post post;
	
	
	public int getCom_Id() {
		return com_Id;
	}
	public void setCom_Id(int com_Id) {
		this.com_Id = com_Id;
	}
	public String getCom_Name() {
		return Com_Name;
	}
	public void setCom_Name(String com_Name) {
		Com_Name = com_Name;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "Comments [com_Id=" + com_Id + ", Com_Name=" + Com_Name + ", post=" + post + "]";
	}
	
	
}
