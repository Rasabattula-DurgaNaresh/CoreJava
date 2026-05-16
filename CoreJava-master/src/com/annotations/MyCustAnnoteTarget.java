package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 
 * @author pardeshi_n
 * Restrict the usage of new annotation on certain java elements such as class, interface or methods. 
 * After specifying the targets, you will be able to use the new annotation on given elements only.
 */

@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR,
        ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE,
        ElementType.PACKAGE, ElementType.PARAMETER})
public @interface MyCustAnnoteTarget {

}
