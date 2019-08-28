package com.cg.MavenDemo.dto;

public class CustomClass extends Exception {
	
	private String name;

	public CustomClass() {
		name=null;
	}
	public CustomClass(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) throws CustomClass {
	
		
		if( !name.equals(name.toUpperCase())) {
			throw new CustomClass("Enter the name in capital letters");
		}
		this.name=name;
	}

	
	
	

}
