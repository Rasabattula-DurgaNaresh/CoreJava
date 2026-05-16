package com.annotations;

import java.lang.annotation.Inherited;

/**
 * 
 * @author pardeshi_n
 * When you apply this annotation to any other annotation i.e @A1 
 * and @A1 is applied of any class MyParentClass
 * then @A1 will be available to all child classes of MyParentClass as well.
 * It essentially means that when you try to lookup the annotation @A1 on any class X, 
 * then all the parent classes of X unto n level are queried for @A1; 
 * and if annotation is present at any level then result is true, 
 * else false.
 */

@Inherited
public @interface MyCustAnnoteInhereted {

}
