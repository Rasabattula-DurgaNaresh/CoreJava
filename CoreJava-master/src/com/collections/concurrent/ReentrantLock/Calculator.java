package com.collections.concurrent.ReentrantLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Calculator implements Runnable {
	private int calculatedValue;
    private int value;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    Calculator(int calculatedValue, int value) {
    	this.calculatedValue = calculatedValue;
    	this.value = value;
    }
    public void calculate(int value) {
        lock.writeLock().lock();
        try {
            this.value = value;
            this.calculatedValue = doMySlowCalculation(value);
        } finally {
            lock.writeLock().unlock();
        }
    }
    public int doMySlowCalculation(int value) {
    	System.out.println("In doMySlowCalculation method "+value);
    	return value;
    }
    public int getCalculatedValue() {
        lock.readLock().lock();
        try {
            return calculatedValue;
        } finally {
            lock.readLock().unlock();
        }
    }

    public int getValue() {
        lock.readLock().lock();
        try {
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }
	@Override
	public void run() {
		System.out.println(getCalculatedValue());
		System.out.println(getValue());
	}
}
