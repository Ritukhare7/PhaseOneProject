package lokers.gradable;

import java.io.File;

public class FileOperations {
	String Company;
	String DevelopedBy;
	public FileOperations() {
		Company = "Lockers Pvt.Ltd";
		DevelopedBy = "Ritu Khare";
		System.out.println("Company : " + Company);
		System.out.println("Developed by : " + DevelopedBy);
		System.out.println();
	}
	
	File file = new File("E:\\DocRitu");
	public void getFileList() {
		String arr[] =file.list();
		System.out.println("The File names are :");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
