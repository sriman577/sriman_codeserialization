package com.sriman.codeandserilization;
public class InterestCalculate {
	public double simpleInterest(double principle_amount,double time,double rate) {
		return (principle_amount*time*rate)/100;
	}
	
	public double compoundInterest(double principle_amount,double time,double rate,double num) {
		double amount = principle_amount*Math.pow(1 + (rate / num), num * time);
        double compoundinterest = amount - principle_amount;
        return compoundinterest;
	}
}