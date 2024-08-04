class Bank{

	int bankId;
	String bankName;
	String branchName;
	String ifscCode;
	String shiftCode;
	int noOfWorkers;
	String branchManagerName;
	
	public Bank(){
		System.out.println("Create object ");
	}
	
	public Bank(int bankId,String bankName,String branchName,String ifscCode,String shiftCode,	int noOfWorkers,	String branchManagerName){
		
		this.bankId=bankId;
		this.bankName=bankName;
		this.branchName=branchName;
		this.ifscCode=ifscCode;
		this.shiftCode=shiftCode;
		this.noOfWorkers=noOfWorkers;
		 this.branchManagerName= branchManagerName;
	}
	
	public void getBankDetails(){
		
		System.out.println("The Bank Details are:");
		System.out.println("The Bank Id is:"+this.bankId);
		System.out.println("The Bank Name is:"+this.bankName);
		System.out.println("The Bank branch name is:"+this.branchName);
		System.out.println("The Bank IFSC code is:"+this.ifscCode);
		System.out.println("The Bank Shift code is:"+this.shiftCode);
		System.out.println("The Bank including the number of workers:"+this.noOfWorkers);
		System.out.println("The Bank Manager name is:"+this.branchManagerName);
		
	}
	
	
}
	