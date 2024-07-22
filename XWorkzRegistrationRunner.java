class XWorkzRegistrationRunner{

	public static void main(String[] xWorkz){
	
		 boolean isXWorkzRegisterCreated=XWorkzRegistration.createUserXWorkzRegister("Rani",null,null,"Anusha",874606889,"rani@gmail.com","04-5-2003",7.6,null);
		
		if(isXWorkzRegisterCreated==true)
		XWorkzRegistration.readUserXWorkzRegisterDetails();
	}
}