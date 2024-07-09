class ComputerRunner{

	public static void main(String[] hp){
	
		System.out.println("Main startted");
		
		boolean connect = Computer.onOrOff();
		System.out.println("The computer connected: " +connect);
			connect = Computer.onOrOff();
		System.out.println("The computer connected :"  +connect);
		
		System.out.println("Main ended");
	}

}
