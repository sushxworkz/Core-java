class SBIBankAccountGenerated{

	static String fName;
	static String fathName;
	static String lName;
	static int age;
	static String dateOfBirth;
	static String adNumber;
	static String pAddress;
	static long mNumber;

	public static boolean createUserBankAccount(String firstName,String fatherName,String lastName,int userAge, String adharNumber,String dob,String permenentAddress,long mobileNumber){
		
		
			 boolean isBankAccountCreated=false;
			 
			 fName=firstName;
			 fathName=fatherName;
			 lName=lastName;
			 age=userAge;
			 dateOfBirth=dob;
			 adNumber=adharNumber;
			 pAddress=permenentAddress;
			 mNumber=mobileNumber;
			 
			 
			isBankAccountCreated=true;
			
			return isBankAccountCreated;
	}
	
	
	public static void readUserBankAccount(){
	
		System.out.println("User Details Are: ");
		
		System.out.println("The user first name is: "+fName);
		System.out.println("The user father name is: "+fathName);
		System.out.println("The user last name is: "+lName);
		System.out.println("The user age: "+age);
		System.out.println("The user first date of birth is: "+dateOfBirth);
		System.out.println("The user adhar number: "+adNumber);
		System.out.println("The user permenent address is: "+pAddress);
		System.out.println("The user mobile number: "+mNumber);
		
	}
}