class SBIBankAccountGenerationRunner{

	public static void main(String[] bank){
	
		boolean  isBankAccountCreated=SBIBankAccountGeneration.createUserBankAccount("Sushmita","Hiragappagol",0L,"09-12-1999","Mandya",72111779076L);
		
		if(isBankAccountCreated==true)
		SBIBankAccountGeneration.readUserBankAccountDetails();
	}

}