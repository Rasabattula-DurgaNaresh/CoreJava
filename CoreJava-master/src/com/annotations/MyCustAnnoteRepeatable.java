package com.annotations;

import java.lang.annotation.Repeatable;


/**
 * 
 * @author pardeshi_n
 * By default, an annotation is applied on a java element only once. 
 * But, by any requirement, you have to apply a annotation more than once, 
 * then use @Repeatable annotation on your new annotation.
 */

///@Repeatable(value = "")
public @interface MyCustAnnoteRepeatable {
	
}
