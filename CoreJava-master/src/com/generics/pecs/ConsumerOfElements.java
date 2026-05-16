package com.generics.pecs;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author pardeshi_n
 *Let’s assume we are defining a method where we will only be adding different fruits inside this basket.
 *addAll(Collection<? super T> c, T... elements)“. 
 *In such case, basket is used for storing the elements so it should be called consumer of elements.
 *We are able to add apple and even Asian apple inside basket,
 * but we are not able to add Fruit (super type of apple) to basket. Why?
 * Reason:  basket is a reference to a List of something that is a supertype of Apple. 
 * We cannot know which supertype it is, but we know that Apple and any of its subtypes 
 * (which are subtype of Fruit) can be added to be without problem 
 * (you can always add a subtype in collection of supertype). 
 * So, now we can add any type of Apple inside basket.
 * What about getting data out of such a type? 
 * It turns out that you the only thing you can get out of it will be Object instances: 
 * since we cannot know which supertype it is, the compiler can only guarantee 
 * that it will be a reference to an Object, since Object is the supertype of any Java type.
 * 
 * We are putting elements inside collection “List<? super Apple> basket“; 
 * so here this basket is actually consuming the elements i.e. apples. 
 * In simple words, when you want to ONLY add elements inside a collection, 
 * treat it as a consumer and use “? super T>” syntax. Now, “Consumer super” also should make more sense to you.
 */

public class ConsumerOfElements {
	 public static void main(String[] args)
	   {
	      //List of apples
	      List<Apple> apples = new ArrayList<Apple>();
	      apples.add(new Apple());
	       
	      //We can assign a list of apples to a basket of apples
	      List<? super Apple> basket = apples;
	       
	      basket.add(new Apple());      //Successful
	      basket.add(new AsianApple()); //Successful
	   //   basket.add(new Fruit());      //Compile time error
	   }
}

	class AsianApple extends Apple {
		   @Override
		   public String toString() {
		      return "I am an AsianApple !!";
		   }
		}