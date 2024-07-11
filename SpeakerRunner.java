class SpeakerRunner{

	public static void main(String[] spaeker){

		System.out.println("Main Started");
		
			boolean connect=Speaker.onOrOff();
			System.out.println("The speaker connected:"+connect);
			
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				Speaker.increaseVolume();
				
				
				Speaker.decreaseVolume();
				Speaker.decreaseVolume();
				Speaker.decreaseVolume();
				Speaker.decreaseVolume();
				Speaker.decreaseVolume();
				Speaker.decreaseVolume();
				Speaker.decreaseVolume();
				
			
				connect =Speaker.onOrOff();
			System.out.println("The speaker connected:"+connect);
			
		System.out.println("Main Ended");
	}
}
				
			