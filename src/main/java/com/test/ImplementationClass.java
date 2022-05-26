package com.test;

public class ImplementationClass implements OlaFair, UberFair{

	@Override
	public int calculateFair(String source, String destination, int travellers, int distance) {
		
		return 0;
	}
	
	@Override
	public void getFair() {
		// TODO Auto-generated method stub
		UberFair.super.getFair();
	}

	public static void main(String[] args) {
		ImplementationClass clas = new ImplementationClass();
		clas.getFair();
	}

	

}
