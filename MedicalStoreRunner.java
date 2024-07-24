class MedicalStoreRunner{

	public static void main(String[] medical){
	
		System.out.println("Main Startd");
		
			boolean addMedicine=MedicalStore.addMedicineName("Capsules");
			System.out.println("The medicine name added:"+addMedicine);
			
				addMedicine=MedicalStore.addMedicineName("Inhalers");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Injection");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Tablet");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Drops");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Lotion");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Cough Syrup");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Onintment");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Antiseptic");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Asirims");
				System.out.println("The medicine name added:"+addMedicine);
				
				addMedicine=MedicalStore.addMedicineName("Powder");
				System.out.println("The medicine name added:"+addMedicine);
				
				
			MedicalStore.showMedicineNames();
		System.out.println("Main Enede");
	}
}