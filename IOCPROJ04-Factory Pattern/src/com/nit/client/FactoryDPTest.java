package com.nit.client;

import com.nit.comps.Bike;
import com.nit.factory.BikeFactory;

public class FactoryDPTest {
     
	public static void main(String[] args) {
		
		Bike bike = BikeFactory.orderBike("standard");
		bike.driver();
		System.out.println("===========================");
		
		Bike bike1 = BikeFactory.orderBike("electric");
		bike.driver();
		System.out.println("===========================");
 
		Bike bike2 = BikeFactory.orderBike("bullet");
		bike.driver();
		System.out.println("===========================");

		Bike bike3 = BikeFactory.orderBike("sports");
		bike.driver();
		System.out.println("===========================");

	}
}
