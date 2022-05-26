package com.test;

public class TaxiFairImpl implements TaxiFair{

	private final static int distanceValue =750;
	private final static int distanceKM =100;

	
	@Override
	public int calculateFair(String source, String destination, int travellers, int distance) {
		if(distance > distanceKM) {
			return travellers * (distanceValue + (distance  - distanceKM) * 5);
		}
		return travellers * distanceValue * 5;
	}

	

}
