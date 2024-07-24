class InstagramAccountGenerated{

	static String emailId;
	static String pwd;
	static String confirmPwd;
	static String name;
	static long mNumber;
	
	
	public static boolean createUserInstagramAccount(String mail,String password, String confirmPassword,String userName,long mobileNumber){
		
		 boolean isInstagramAccountCreated=false;
		
		emailId=mail;
		pwd=password;
		confirmPwd=confirmPassword;
		name=userName;
		mNumber=mobileNumber;
		
		
		isInstagramAccountCreated=true;
		
		return isInstagramAccountCreated;
	}
	
	public static void readUserInstagramAccountDetails(){
		
		System.out.println("User Details are");
		
		System.out.println("The user mail: "+emailId);
		System.out.println("The user password: "+pwd);
		System.out.println("The user confirm password: "+confirmPwd);
		System.out.println("The user name: "+name);
		System.out.println("The user mobile number: "+mNumber);

		
		
	}
}