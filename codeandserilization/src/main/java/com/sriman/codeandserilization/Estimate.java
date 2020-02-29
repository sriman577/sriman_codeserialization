package com.sriman.codeandserilization;

public class Estimate {
	public double estimateHouse(double area,int stndrd,boolean fullyautomated) {
		int cost[]= {1200,1500,1800,2500};
		int costpersqfeet = 0;
		if(fullyautomated)
			costpersqfeet = cost[3];
		else
			costpersqfeet = cost[stndrd-1];
		return (double)area*costpersqfeet;
		
	}
}