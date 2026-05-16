package com.generics.genTypeArrays;

/**
 * 
 * @author pardeshi_n
 *
 * @param <T>
 * Array in any language have same meaning i.e. an array is a collection of similar type of elements. 
 *  In java, pushing any incompatible type in an array on runtime will throw ArrayStoreException. 
 *  It means array preserve their type information in runtime, 
 *  and generics use type erasure or remove any type information in runtime. 
 *  Due to above conflict, instantiating a generic array in java is not permitted.
 * 
 */
public class GenericArray<T> {
	// this one is fine
    public T[] notYetInstantiatedArray;
  
    // causes compiler error; Cannot create a generic array of T
  //  public T[] array = new T[5];
}
