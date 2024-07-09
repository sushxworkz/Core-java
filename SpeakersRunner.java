class SpeakersRunner{

	public static void main(String[] speaker){
	
		System.out.println("main startted");
		
		boolean connect = Speakers.onOrOff();
		System.out.println("The speaker connected: " +connect);
			connect = Speakers.onOrOff();
		System.out.println("The speaker connected :"  +connect);
		
		System.out.println("mainended");
	}

}