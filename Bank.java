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
}
	