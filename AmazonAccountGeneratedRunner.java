class AmazonAccountGeneratedRunner{

	public static void main(String[] amazon){
	
		boolean isAmazonAccountCreated=AmazonAccountGenerated.createUserAmazonAccount(0,"sushmita@gmail.com","Sushmita34","Sushmita34","Sushmita","Hiragappagol");
		
		if(isAmazonAccountCreated==true)
		AmazonAccountGenerated.readUserAmazonAccountDetails();
	}
}