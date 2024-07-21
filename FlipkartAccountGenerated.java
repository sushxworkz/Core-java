class FlipkartAccountGenerated{


	static long mNumber;
	static String emailId;
	static String pwd;
	static String loginPwd;
	static String fName;
	static String lName;
	
	
	
	public static boolean createUserFlipkartAccount(long mobileNumber,String mail,String password, String loginPassword,String userFirstName,String userLastName){
		
		 boolean isFlipkartAccountCreated=false;
		
		
		mNumber=mobileNumber;
		emailId=mail;
		pwd=password;
		loginPwd=loginPassword;
		fName=userFirstName;
		lName=userLastName;
		
		
		
		isFlipkartAccountCreated=true;
		
		return isFlipkartAccountCreated;
	}
	
	public static void readUserFlipkartAccountDetails(){
		
		System.out.println("User Details are");
		
		System.out.println("The user mobile number: "+mNumber);
		System.out.println("The user mail: "+emailId);
		System.out.println("The user password: "+pwd);
		System.out.println("The user login password: "+loginPwd);
		System.out.println("The user first name: "+fName);
		System.out.println("The user last name: "+lName);

		
		
	}
}