package com.annotations.question1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Question1 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> clazz = Class.forName("com.annotations.question1.AnnotatedClass");

		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			//System.out.println(annotations);
			for(Annotation annotation: annotations) {
				System.out.println(annotation);
			}
			// readAnnotation(method);
//			if (method.isAnnotationPresent(Author.class)) {
//
//				Author author = method.getAnnotation(Author.class);
//
//				System.out.println(author.name());
//
//			}
//			if (method.isAnnotationPresent(Version.class)) {
//
//				Version version = method.getAnnotation(Version.class);
//
//				System.out.println(version.number());
//
//			}
		}
	}
}
