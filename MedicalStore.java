class MedicalStore{

	static String medicineNames[]={null,null,null,null,null,null,null,null,null,null};
	static int start;
	
	public static boolean addMedicineName(String medicineName){

		boolean isMedicineNameAdded=false;
			if(start< medicineNames.length){
			
				if(medicineName!=null){
				 medicineNames[start++]= medicineName;
				}
				else
					System.out.println("Medicine name is Invalid");
					isMedicineNameAdded=true;
				}
			else
				System.out.println("Sorry...Medicine names are full");
		return isMedicineNameAdded;
	}
	
	public static void showMedicineNames(){
	
		System.out.println("Available Medicine Names Are:");
		
		for(String medicineName:medicineNames){
			System.out.println(medicineName);
		}
	}
}
			