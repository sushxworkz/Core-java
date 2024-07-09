class ScannerRunner{

	public static void main(String[] canon){
	
		System.out.println("Main Started");
			boolean connect=Scanner.onOrOff();
			System.out.println("The Scanner Connected:"+connect);
				connect=Scanner.onOrOff();
			System.out.println("The Scanner Connected:"+connect);
		System.out.println("Main Ended");
	}
}