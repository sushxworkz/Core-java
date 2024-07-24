class PANCardGenerated{

	static String fName;
	static String lName;
	static String fathName;
	static String mName;
	static int age;
	static String dateOfBirth;
	static long adNumber;
	static String gender;
	static String pAddress;
	static long mNumber;
	static long pinCode;

	public static boolean createUserPANCard(String firstName,String lastName,String fatherName,String motherName,int userAge, long adharNumber,String userGender,String dob,String permenentAddress,long mobileNumber,long userPinCode){
		
		
			 boolean isPANCardCreated=false;
			 
			 fName=firstName;
			 lName=lastName;
			 fathName=fatherName;
			 mName=motherName;
			 age=userAge;
			 dateOfBirth=dob;
			 adNumber=adharNumber;
			 gender=userGender;
			 pAddress=permenentAddress;
			 mNumber=mobileNumber;
			 pinCode=userPinCode;
			 
			 
			isPANCardCreated=true;
			
			return isPANCardCreated;
	}
	
	
	public static void readUserPANCardDetails(){
	
		System.out.println("User Details Are: ");
		
		System.out.println("The user first name is: "+fName);
		System.out.println("The user last name is: "+lName);
		System.out.println("The user father name is: "+fathName);
		System.out.println("The user mother name is: "+mName);
		System.out.println("The user age: "+age);
		System.out.println("The user first date of birth is: "+dateOfBirth);
		System.out.println("The user adhar number: "+adNumber);
		System.out.println("The user gender  is: "+gender);
		System.out.println("The user permenent address is: "+pAddress);
		System.out.println("The user mobile number: "+mNumber);
		System.out.println("The user pincode  is: "+pinCode);
		
	}
}