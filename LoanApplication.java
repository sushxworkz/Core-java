class LoanApplication{
	
	static String creditS;
	static String loanT;
	static String loanName;
	static String bankName;
	static  String interest;
	static String years;
	
	 public static boolean createLoanAccount(String creditScore , String loanType , String loanApplicantName , String bankName , String rateOfInterest , String yearsOfLoan){
		boolean isLoanCreated = false;
		
		boolean iscreditScoreValid = false;
		boolean isloanTypeValid = false;
		boolean isloanApplicantNameValid = false;
		boolean isbankNameValid = false;
		boolean israteOfInterestValid = false;
		boolean isyearsOfLoanValid = false;
		
		if( creditScore!= null){
			creditS = creditScore;
			iscreditScoreValid= true;
		}
		else
			System.out.println("The credit score is Invalid");
		
		
		if( loanType!= null){
			loanT = loanType;
			isloanTypeValid= true;
		}
		else
			System.out.println("The loan type is Invalid");
		
		
		if( loanApplicantName!= null){
			loanName = loanApplicantName;
			isloanApplicantNameValid= true;
		}
		else
			System.out.println("The loan applicantNameis Invalid");
		
		
		if( bankName!= null){
			bankName = bankName;
			isbankNameValid= true;
		}
		else
			System.out.println("The bank name is Invalid");
		
		
		if( rateOfInterest!= null){
			interest = rateOfInterest;
			israteOfInterestValid= true;
		}
		else
			System.out.println("The rate Of interest is Invalid");
		
		
		if(yearsOfLoan != null){
			years = yearsOfLoan;
			isyearsOfLoanValid= true;
		}
		else
			System.out.println("The  years Of loanis Invalid");
		
		
		if( iscreditScoreValid == true && isloanTypeValid == true && isloanApplicantNameValid== true && isbankNameValid== true && israteOfInterestValid == true && isyearsOfLoanValid== true){
			isLoanCreated = true;
		}
		return isLoanCreated;
	}
	
	public static void readLoanAccount(){
		
		System.out.println("The User Loan Application");
		System.out.println("The credit score:"+creditS);
		System.out.println("The loan type:"+loanT);
		System.out.println("The applicant name:"+loanName);
		System.out.println("The bank Name:"+bankName);
		System.out.println("The rate Of interest:"+interest);
		System.out.println("The loan of years:"+years);

	}
}