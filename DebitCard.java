class DebitCard{

	int cardId;
	String cardHolderName;
	long cardNo;
	String expDate;
	int cvv;
	
	public DebitCard(){
		System.out.println("Create the object");
	}
	
	public DebitCard(int cardId,String cardHolderName,long cardNo,String expDate,int cvv){
		
		this.cardId=cardId;
		this.cardHolderName=cardHolderName;
		this.cardNo=cardNo;
		this.expDate=expDate;
		this.cvv=cvv;
	}
	
	public void getDebitCardDetails(){
		
		System.out.println("The Debit Card Details Are:");
		System.out.println("The Debit Card Id is:"+this.cardId);
		System.out.println("The Debit Card Holder Name is:"+	this.cardHolderName);
		System.out.println("The Debit Card Number is:"+this.cardNo);
		System.out.println("The Debit Card Expire Date is:"+this.expDate);
		System.out.println("The Debit Card CVV is:"+this.cvv);
	}
		
}