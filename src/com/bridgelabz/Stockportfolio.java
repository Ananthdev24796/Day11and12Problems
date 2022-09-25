package com.bridgelabz;

public class Stockportfolio {
	
	public static void main(String[] args) {
		int totalValueOfAllStocks=0;
	Stocks[] stock = new Stocks[3];
	stock[0]= new Stocks("Apple",5,50, 80);
	stock[1]= new Stocks("Samsung",10,100,56);
	stock[2]= new Stocks("oneplus",5,20,78);
	
	for(int i=0; i<stock.length; i++) {
		
		stock[i].calculateValueOfShares();
		stock[i].stockReport();
		System.out.println();
		totalValueOfAllStocks += stock[i].valueOfShares;
		
	}
	
	System.out.println("Total value of all stocks = "+totalValueOfAllStocks);

}
}
