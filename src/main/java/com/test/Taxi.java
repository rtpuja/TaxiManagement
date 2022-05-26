package com.test;

public class Taxi {
	private String source;
	private String destination;
	private Long fair;
	private int travellers;
	private int distance;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Long getFair() {
		return fair;
	}

	public void setFair(Long fair) {
		this.fair = fair;
	}

	public int getTravellers() {
		return travellers;
	}

	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Taxi [source=" + source + ", destination=" + destination + ", fair=" + fair + ", travellers="
				+ travellers + ", distance=" + distance + "]";
	}
	
	

}
