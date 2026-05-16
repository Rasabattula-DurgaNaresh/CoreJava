package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author pardeshi_n
 * Specifies how the marked annotation is stored in java runtime
 * Whether it is limited to source code only, 
 * embedded into the generated class file, 
 * or it will be available at runtime through reflection as well
 */

//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.SOURCE)
public @interface MyCustAnnoteRetention {

}
