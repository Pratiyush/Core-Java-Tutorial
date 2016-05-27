package demo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public @interface Author {
	String name();
	String date()  default "[2008/01/01]";
}
