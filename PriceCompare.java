class PriceCompare{
	public static void main(String[] args){
		double price1 = 8499.05;
		double price2 = 2500.01;
		double price3 = 4999.99;
		
		if(price1 < price2 & price1 < price3){
			System.out.println("The cheapest one is laptop 1");
		} else if(price2 < price1 & price2 < price3){
			System.out.println("The cheapest one is laptop 2");
		} else {
			System.out.println("The cheapest one is laptop 3");
		}
	}

}