package lokers.gradable;

import java.io.File;
import java.util.Scanner;

public class UserOptionsPrimary extends UserOptionsSecondary {
   
	//FileOperations fileOperations;
	//UserOptionsSecondary userOptionsSecondary= new UserOptionsSecondary();
	
	//Ankur
	File file;
	Scanner scanner;
	

	
	
	
	public void displayPrimaryOptions() {
		System.out.println(" "
				+ "\nPlease select any of the following options:\n"
				+ "\n\tChoose 1 for listing the files"
				+ "\n\tChoose 2 for Add, Search, Or Delete a file"
                + "\n\tChoose 3 to exit the application\n");
		

	}
	
	
	public int takeUserInput() {
		
		scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}


	public void primaryFunction() {
		switch (takeUserInput()) {
		case 1:
			getFileList();
			displayPrimaryOptions();
			primaryFunction();
			break;
		case 2:
			//Secondary options should be printed
			// Create one method which takes user input again
			// Based on the input - do the transactions
			displaySecondaryOptions();
			secondaryFunction();
			
			break;
		case 3:
			try {
				System.out.println("Thank you for using the application!");
				System.exit(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
			}

		default:
			throw new IllegalArgumentException("Unexpected value: " + takeUserInput());
		}
	}


	
}
