class TeaPointRunner{

	public static void main(String[] tea){
	
		boolean addTea=TeaPoint.addTeaName("Green Tea");
			System.out.println("The tea name added : "+addTea);
			
			addTea=TeaPoint.addTeaName("Kesar Tea");
			System.out.println("Tea name added:"+addTea);
			
			addTea=TeaPoint.addTeaName("Amrut Tea");
			System.out.println("The name added:"+addTea);
			
			addTea=TeaPoint.addTeaName("Elachi Tea");
			System.out.println("Tea name added:"+addTea);
			
			addTea=TeaPoint.addTeaName("Irani Tea");
			System.out.println("Tea name added:"+addTea);
			
			
			addTea=TeaPoint.addTeaName("Ginger Tea");
			System.out.println("Tea name added:"+addTea);
			
		
			
		
			
				boolean updateTeaName=TeaPoint.updateTeaName("Masala Tea","Amrut Tea");
				System.out.println("The tean is updated"+updateTeaName);
				
			

		
		boolean teaNameDeleted=TeaPoint.deleteTeaName("Green Tea");
		System.out.println("The tea name deleted:"+teaNameDeleted);
		
		TeaPoint.showTeaNames();
	}
	
	
}