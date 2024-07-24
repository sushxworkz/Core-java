class JuiceShop{

	static String juiceNames[]={null,null,null,null,null,null};
	static int start;
	
	public static boolean addJuiceName(String juiceName){
	
		boolean isJuiceNameAdded=false;
			
			if(start<juiceNames.length){
			
				if(juiceName!=null){
					juiceNames[start++]=juiceName;
				
					isJuiceNameAdded = true;
				}
				else
					System.out.println("Juice name Invalid");
			}
			else
				System.out.println("Sorry...Juice names are full");
				
		return isJuiceNameAdded;
	}
		
		
	public static void  showJuiceNames(){
	
		System.out.println("Available Juice Names Are:");
		
			for(String juiceName:juiceNames){
				System.out.println(juiceName);
			}
	}
}
					
				