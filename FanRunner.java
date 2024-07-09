class FanRunner{

	public static void main(String[] croptom ){
	
		System.out.println("Main startted");
		
		boolean connect = Fan.onOrOff();
		System.out.println("The Fan connected: " +connect);
			connect = Fan.onOrOff();
		System.out.println("The Fan connected :"  +connect);
		
		System.out.println("Main ended");
	}

}