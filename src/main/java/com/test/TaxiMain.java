package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TaxiMain {

	public static void main(String[] args) {
		List<Taxi> list = getRecords();
		System.out.println("Enter Source");
		Scanner sc = new Scanner(System.in);
		String source = sc.nextLine();
		System.out.println("Enter Destination");
		sc = new Scanner(System.in);
		String destination = sc.nextLine();
		System.out.println("Enter Travellers");
		sc = new Scanner(System.in);
		int travellers = sc.nextInt();
		int distance = getKm(source, destination, list);
		TaxiFair fair = new TaxiFairImpl();
		float totalFairs = fair.calculateFair(source, destination, travellers, distance);
		System.out.println("Taxi Ticket\n------------");
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("Kms: " + distance);
		System.out.println("No. of Travellers= " + travellers);
		System.out.println("Total: " + totalFairs);
	}

	private static int getKm(String source, String destination, List<Taxi> list) throws RecordsNotFoundException {
   
		Optional<Taxi> taxi = list.stream()
				.filter(e -> (e.getSource().equalsIgnoreCase(source) || e.getSource().equalsIgnoreCase(destination))
						&& (e.getDestination().equals(source) || e.getDestination().equals(destination)))
				.findFirst();
		if (taxi.isPresent()) {
			return taxi.get().getDistance();
		} else {
			throw new RecordsNotFoundException("Records not found");
		}

	}

	private static List<Taxi> getRecords() {

		List<Taxi> list = new ArrayList<>();
		Taxi taxi = new Taxi();
		taxi.setSource("PUNE");
		taxi.setDestination("NASHIK");
		taxi.setDistance(200);
		list.add(taxi);
		taxi = new Taxi();
		taxi.setSource("PUNE");
		taxi.setDestination("MUMBAI");
		taxi.setDistance(120);
		list.add(taxi);
		taxi = new Taxi();
		taxi.setSource("MUMBAI");
		taxi.setDestination("GOA");
		taxi.setDistance(350);
		list.add(taxi);
		taxi = new Taxi();
		taxi.setSource("MUMBAI");
		taxi.setDestination("NASHIK");
		taxi.setDistance(180);
		list.add(taxi);
		return list;
	}
}
