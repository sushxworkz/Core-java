class LaptopRunner{

	public static void main(String[] dell){
	
		System.out.println("Main startted");
		
		boolean connect = Laptop.onOrOff();
		System.out.println("The Laptop connected: " +connect);
			connect = Laptop.onOrOff();
		System.out.println("The Laptop connected :"  +connect);
		
		System.out.println("Main ended");
	}

}