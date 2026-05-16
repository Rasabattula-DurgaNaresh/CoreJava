package com.designpattern.structural.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
	Volt v = getVolt();
	
	@Override
	public Volt get120Volt() {
		return getVolt();
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
