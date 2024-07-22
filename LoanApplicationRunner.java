class LoanApplicationRunner{

    public static void main(String[]loan){
		
		
		boolean isLoanCreated=LoanApplication.createLoanAccount(null,"Personal Loan ","Anu","Canara",null,"60years");
		
		
		if(isLoanCreated == true)
		LoanApplication.readLoanAccount();
		
	}
}