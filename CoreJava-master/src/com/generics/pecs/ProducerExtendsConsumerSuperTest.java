package com.generics.pecs;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author pardeshi_n
 *This is the first part of PECS i.e. PE (Producer extends). 
 * When we pick a fruit from basket, then we want to be sure that we are taking out only fruit only and nothing else
 * It ensures that whatever it comes out from basket is definitely going to be a fruit; so you iterate over 
 * it and simply cast it a Fruit. 
 * Now in last two lines, I tried to add an Apple and then a Fruit in basket, but compiler didn’t allowed me.
 * reason: <? extends Fruit> wildcard tells the compiler that we’re dealing with a subtype of the type Fruit, 
 * but we cannot know which fruit as there may be multiple subtypes.
 * Since there’s no way to tell, and we need to guarantee type safety (invariance), 
 * you won’t be allowed to put anything inside such a structure.
 * On the other hand, since we know that whichever type it might be, 
 * it will be a subtype of Fruit, we can get data out of the structure with the guarantee that it will be a Fruit.
 * 
 * we are taking elements out of collection “List<? extends Fruit> basket“; 
 * so here this basket is actually producing the elements i.e. fruits.
 * In simple words, when you want to ONLY retrieve elements out of a collection, 
 * treat it as a producer and use “? extends T>” syntax. 
 * “Producer extends”  
 */
public class ProducerExtendsConsumerSuperTest {
	public static void main(String[] args)
	   {
	      //List of apples
	      List<Apple> apples = new ArrayList<Apple>();
	      apples.add(new Apple());
	       
	      //We can assign a list of apples to a basket of fruits;
	      //because apple is subtype of fruit
	      List<? extends Fruit> basket = apples;
	      //Here we know that in basket there is nothing but fruit only
	      for (Fruit fruit : basket)
	      {
	         System.out.println(fruit);
	      }
	       
	      //basket.add(new Apple()); //Compile time error
	      //basket.add(new Fruit()); //Compile time error
	   }
}

class Fruit {
	   @Override
	   public String toString() {
	      return "I am a Fruit !!";
	   }
	}
	 
	class Apple extends Fruit {
	   @Override
	   public String toString() {
	      return "I am an Apple !!";
	   }
	}