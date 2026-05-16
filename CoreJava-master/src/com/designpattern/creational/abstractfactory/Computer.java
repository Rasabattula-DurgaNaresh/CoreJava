package com.designpattern.creational.abstractfactory;
/**
 * 
 * @author pardeshi_n
 *In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class 
 *and then an Abstract Factory class that will return the sub-class based on the input factory class
 */
public abstract class Computer {
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
