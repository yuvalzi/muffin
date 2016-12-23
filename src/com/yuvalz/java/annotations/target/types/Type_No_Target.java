package com.yuvalz.java.annotations.target.types;

import com.yuvalz.java.annotations.target.annotations.Annotation_No_Target;

@Annotation_No_Target
public class Type_No_Target<T> {
	
	@Annotation_No_Target
	public Type_No_Target(@Annotation_No_Target String contructorParam){}
	
	@Annotation_No_Target
	public void test(@Annotation_No_Target String methodParam){
		@Annotation_No_Target String localParam;
	}
}