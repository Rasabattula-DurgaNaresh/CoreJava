package com.designpattern.creational.builder;
/**
 * 
 * @author pardeshi_n
 *Computer class has only getter methods and no public constructor, 
 *so the only way to get a Computer object is through the ComputerBuilder class.
 */
public class Computer {
	//required parameters
    private String HDD;
    private String RAM;
     
    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	/**
	 * @return the hDD
	 */
	public String getHDD() {
		return HDD;
	}
	/**
	 * @return the rAM
	 */
	public String getRAM() {
		return RAM;
	}
	/**
	 * @return the isGraphicsCardEnabled
	 */
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	/**
	 * @return the isBluetoothEnabled
	 */
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	
    
	//Builder Class
    public static class ComputerBuilder{
    	// required parameters
        private String HDD;
        private String RAM;
 
        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
         
        public ComputerBuilder(String hdd, String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }
        
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
 
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
         
        public Computer build(){
            return new Computer(this);
        }
    }
}
