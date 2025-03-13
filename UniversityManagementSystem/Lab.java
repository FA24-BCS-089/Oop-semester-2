package UniversityManagementSystem;

public class Lab{
	private String labName;
	private String labStaff;
	private PC[] pcs;

	public Lab(String labName, String labStaff){
		this.labName = labName;
		this.labStaff = labStaff;
		this.pcs = new PC[10];
		for(int i=0; i<10; i++){
			pcs[i]= new PC(i+1, "Intel i5", 8, 512);		
		}
	} 

	public void displayLab(){
		System.out.println("Lab Name; " + labName + ", Lab Staff: " + labStaff);
		System.out.println("PCs in lab: ");
		for(PC pc:pcs){
			pc.displayPC();
		}
	}

}