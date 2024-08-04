class BankRunner{

	public static void main(String bank[]){
		
		System.out.println("Main Started");
	
		Bank ref=new Bank(678,"Canara","Benglore","CNR0000705","ATCUNOM00ER",67,"Sahank");
		ref.getBankDetails();
		
		Bank ref1=new Bank(456,"Bank Of Baroda","Benglore","BARBOMGBANG","BANKOFRUIO",97,"Santanu");
		ref1.getBankDetails();
	
		Bank ref2=new Bank(784,"Union Bank of India","Munbai","UBI0568661","NADUKERTYO",90,"Amir");
		ref2.getBankDetails();
		
		Bank ref3=new Bank(980,"Axis Bank","Munbai","UTIB000039","NMKERTOBF",56,"Ranjit");
		ref3.getBankDetails();
		
		Bank ref4=new Bank(345,"ICICI Bank","Bandra Kurla  Complex","ICIC000039","EGITOKNHDS",89,"Omkar");
		ref4.getBankDetails();
		
		Bank ref5=new Bank(890,"Indian Bank","Chennai","IDIB000T065","TRFYERTG097",90,"Suresh");
		ref5.getBankDetails();
		
		Bank ref6=new Bank(623,"Kotak Mahindra Bank","Munbai","KKBK0000471","YUIOEGYTY",78,"Bharash");
		ref6.getBankDetails();
		
		Bank ref7=new Bank(874,"HDFC Bank","Mumbai","HDFC0000010","CGBJURRTG",45,"Anuj");
		ref7.getBankDetails();
		
		Bank ref8=new Bank(987,"SBI","Delhi","SBIN0000691","GFERTUOUG",94,"Sandesh");
		ref8.getBankDetails();
		
		
		
		
		System.out.println("Main Ended");
		
		
	}
}