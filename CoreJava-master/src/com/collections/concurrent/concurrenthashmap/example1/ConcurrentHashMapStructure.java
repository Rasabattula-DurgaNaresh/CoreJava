package com.collections.concurrent.concurrenthashmap.example1;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapStructure {
	 public static void main(String[] args) {  
         
	        Country india=new Country("India",1000);  
	        Country japan=new Country("Japan",10000);  
	            
	        Country france=new Country("France",2000);  
	        Country russia=new Country("Russia",20000); 
	        
	        Country A=new Country("A",20000);
	        Country B=new Country("B",20000);
	        Country C=new Country("C",20000);
	        Country D=new Country("D",20000);
	        Country E=new Country("E",20000);
	        Country F=new Country("F",20000);
	        Country G=new Country("G",20000);
	        Country H=new Country("H",20000);
	        Country I=new Country("I",20000);
	        Country J=new Country("J",20000);
	        Country K=new Country("K",20000);
	        Country L=new Country("L",20000);
	        Country M=new Country("M",20000);
	        Country N=new Country("N",20000);
	        Country aaa=new Country("AAA",20000);  

	        ConcurrentHashMap<Country,String> countryCapitalMap = new ConcurrentHashMap<Country,String>();
	        countryCapitalMap.put(india, "delhi");
	        countryCapitalMap.put(japan,"Tokyo");  
	        countryCapitalMap.put(france,"Paris");  
	        countryCapitalMap.put(russia,"Moscow");  
	        countryCapitalMap.put(A,"A");  
	        countryCapitalMap.put(B,"B"); 
	        countryCapitalMap.put(C,"C");  
	        countryCapitalMap.put(D,"D");  
	        countryCapitalMap.put(E,"E");  
	        countryCapitalMap.put(F,"F");  
	        countryCapitalMap.put(G,"G");  
	        countryCapitalMap.put(H,"H");  
	        countryCapitalMap.put(I,"I");  
	        countryCapitalMap.put(J,"J");  
	        countryCapitalMap.put(K,"K");  
	        countryCapitalMap.put(L,"L");  
	        countryCapitalMap.put(M,"M");  
	        countryCapitalMap.put(N,"N");  
	        countryCapitalMap.putIfAbsent(aaa, "bbb");
	        countryCapitalMap.putIfAbsent(russia,"Moscow");
	        
	        
	        Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();
	        while(countryCapitalIter.hasNext()) {
	        	Country countryObj = countryCapitalIter.next();
	        	String countrycap = countryCapitalMap.get(countryObj);
	        	System.out.println(countryObj.getName()+" ...."+countrycap);
	        }
	 }
}
