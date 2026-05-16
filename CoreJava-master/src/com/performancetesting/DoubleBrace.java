package com.performancetesting;

import java.util.HashSet;
import java.util.Set;

public class DoubleBrace {

	public static void main(String[] args) {
		Set<String> params = new HashSet<String>() {
            {
                add("param one");
                add("param two");
                add("param three");
                add("param four");
            }
        };
        // ... and so on; Now pass above collection as parameter to method or
        // some other ways
        useParamsInSomeMethod(params);
        useParamsInSomeMethod(new HashSet<String>() {
            {
                add("param one");
                add("param two");
                add("param three");
                add("param four");
            }
        });
    }
	private static void useParamsInSomeMethod(Set<String> params) {
	    // TODO Auto-generated method stub
	}
    
	}
