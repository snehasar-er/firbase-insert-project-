package com.example.myapplication;

public class Inspire {
	String id ;
	String text ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Success{" +
				"id='" + id + '\'' +
				", text='" + text + '\'' +
				'}';
	}

	public Inspire(String id, String text) {
		this.id = id;
		this.text = text;
	}
	public Inspire()
	{

	}
}
