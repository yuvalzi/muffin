package com.yuvalz.java.annotations.target.types;

import com.yuvalz.java.annotations.target.annotations.Annotation_No_Target;

public class Type_No_Target_Compile_Error<@Annotation_No_Target T> {
	
	public Type_No_Target_Compile_Error(String contructorParam){}
	
	public void test(String methodParam){
		String localParam;
	}
}