class Journey{
	public static void main(String[] args){
		double distance = 550;
		
		if(distance <= 0.3){
			System.out.println("Go by feet");
		} else if(distance > 0.3 & distance <= 2.7){
			System.out.println("Go by bike");
		} else if(distance > 2.7 & distance <= 1000){
			System.out.println("Drive by car");
		} else {
			System.out.println("Fly by plane");
		}
	}

}