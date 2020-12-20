class ShopAssistant{
	public static void main(String[] args){
		double cash = 5;
		double butterPrice = 3.99;
		double breadPrice = 2.50;
		double rollPrice = 0.50;
		
		if(butterPrice+breadPrice <= cash){
			System.out.println("Chris bought bread and butter");
		} else if(2*rollPrice+butterPrice <= cash){
			System.out.println("Chris bought 2 rolls and butter");
		} else if(rollPrice <= cash){
			System.out.println("Chris bought 1 roll");
		} else {
			System.out.println("Chris bought nothing");
		}
	}
}