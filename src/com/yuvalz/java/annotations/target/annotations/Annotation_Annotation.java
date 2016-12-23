package com.yuvalz.java.annotations.target.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
public @interface Annotation_Annotation {
	Annotation_No_Context[] annotation_no_Contexts() default {};

}
