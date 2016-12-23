package com.yuvalz.java.annotations.target.types;

import com.yuvalz.java.annotations.target.annotations.Annotation_Constructor_Method;

public class Type_Constructor_Method<T> {
	
	@Annotation_Constructor_Method
	public Type_Constructor_Method(String contructorParam){}
	
	@Annotation_Constructor_Method
	public void test(String methodParam){
		String localParam;
	}
}