package demo.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Demonstration of built-in meta annotation @java.lang.annotation.Target
@Target({ElementType.METHOD} )
@Retention(RetentionPolicy.SOURCE)
@interface TMA {
}

@TMA
class TargetAnnotationDemo {
	@TMA
	public int testMethod() {
		return 0;
	}
}


// Demonstration of built-in meta annotation @java.lang.annotation.Retention
// Three kinds: SOURCE, CLASS, RUNTIME
// SOURCE - Available at the source code level only
// CLASS - Recorded in class files but ignored by JVM
// RUNTIME - Recorded in class files and retained by JVM at runtime. Hence, can be reflectively read.  
@Retention(RetentionPolicy.RUNTIME)
@interface RMA {
}

@RMA
class RetentionMetaAnnotationDemo {
}


//Demonstration of built-in meta annotation @java.lang.annotation.Inherited
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface IMA {
}

@IMA
class ParentClass {
}

class ChildClass extends ParentClass {
}

//Demonstration of built-in meta annotation @java.lang.annotation.Documented
@Documented
@interface Unused {
}


public class DemoMetaAnnotations {
	@Unused
	public void unusedMethod() {
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		// Demo of RUNTIME kind of Retention meta annotation
		boolean bAnnotationPresent = RetentionMetaAnnotationDemo.class.isAnnotationPresent(demo.annotations.RMA.class);
		System.out.println("\nAnnotation present in RetentionMetaAnnotationDemo Class ==> " + bAnnotationPresent);
		Class objClass = Class.forName("demo.annotations.RetentionMetaAnnotationDemo");
		Annotation[] annotations = objClass.getAnnotations();
		System.out.println("Number of annotations=" + annotations.length + ", Annotation=" + annotations[0]);
		
		// Demo of Inherited meta annotation
		bAnnotationPresent = ChildClass.class.isAnnotationPresent(demo.annotations.IMA.class);
		System.out.println("\nAnnotation present in Child Class ==> " + bAnnotationPresent);
		Class objClass1 = Class.forName("demo.annotations.ChildClass");
		Annotation[] annotations1 = objClass1.getAnnotations();
		System.out.println("Number of annotations in Child Class=" + annotations1.length + ", Child Class Annotation=" + annotations1[0]);
	}
}
