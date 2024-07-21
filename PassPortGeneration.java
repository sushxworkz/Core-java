class PassPortGeneration{

	static String cpvLoc;
	static  String dcdrLoc ;
	static  String name;
	static String sName;
	static String dateOfBirth;
	static String mailId;
	static String  sameLogin;
	static String mailLogin;
	static String password;
	static String confirmPassord;
	static String hintQuestion;
	static String hintanswer;
	static String captchaName;
	public static boolean createUserPassPort(String cpvLocation,String dcdrLocation,String givenName,String surName,String dob,String emali,String  isEmailLoginSame,String loginId,String pwd,String confirmwd,String hintQue,String  hintAns, String captcha){
	
		boolean isPassPortCreated=false;
		
		cpvLoc=cpvLocation;
		dcdrLoc=dcdrLocation;
		name=givenName;
		sName=surName;
		dateOfBirth=dob;
		mailId=emali;
		sameLogin=isEmailLoginSame;
		mailLogin=loginId;
		password=pwd;
		  confirmPassord   =confirmwd;
		  hintQuestion=hintQue;
			hintanswer				=hintAns;
					captchaName	=captcha;
					
					
		isPassPortCreated=true;
		
			
		return isPassPortCreated;
		
	} 
	
	public static void readUserPassPortDetails(){
		
		
		System.out.println("Fetching ... user details...");
		
			System.out.println("The User CPV Location: "+cpvLoc);
			System.out.println("The User DCD Location: "+dcdrLoc);
			System.out.println("The User Name Is:  "+name);
			System.out.println("The User Surname is: "+sName);
			System.out.println("The User Date of Birth:"+dateOfBirth);
			System.out.println("The User Email Id:"+mailId);
			System.out.println("The User isEmailLoginSame : "+sameLogin);
			System.out.println("The User Login Id: "+mailLogin);
			System.out.println("The User Password:"+password);
			System.out.println("The User Confirm Password:"+confirmPassord);
			System.out.println("The User Hint Question:"+hintQuestion);
			System.out.println("The User Hint Answer: "+hintanswer);
			System.out.println("The User captcha:" +captchaName);
	}
}
	