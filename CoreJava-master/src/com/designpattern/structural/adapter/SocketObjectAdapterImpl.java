package com.designpattern.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
	//Using Composition for adapter pattern
    private Socket sock = new Socket();
    Volt v = sock.getVolt();
    
	@Override
	public Volt get120Volt() {
		return v;
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(v, 40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		 return new Volt(v.getVolts()/i);
	}
}
