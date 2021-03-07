package lokers.gradable;

import java.util.Scanner;

public class UserOptionsSecondary extends FileOperations {
	
		Scanner scanner;

	public void displaySecondaryOptions() {
		System.out.println(" " + "\nPlease select any of the following options:\n" + "\n\tChoose a for Adding the files"
				+ "\n\tChoose b for deleting a file" + "\n\tChoose c to search a file\n" +
				"\n\tChoose d to back to previous menu\n");
	}

	public String takeUserSecondaryInput() {

		scanner = new Scanner(System.in);
		String secondaryOption = scanner.next();
		return secondaryOption;
	}

	//TO be reviewed
	public String takeFile() {
	    scanner = new Scanner(System.in);
		String name = scanner.next();
		return name;
	}

	
	public void secondaryFunction() {
		try {
			switch (takeUserSecondaryInput()) {
			case "a":
				System.out.println(" Please enter the name of the file you want to add..");
				addFile(takeFile());
				displaySecondaryOptions();
				secondaryFunction();
				break;

			case "b":
				System.out.println("Enter the name of the file you want to delete..");
				deleteFile(takeFile());
				displaySecondaryOptions();
				secondaryFunction();
				break;

			case "c":
				System.out.println("Enter the name of the file you want to search..");
				searchFile(takeFile());
				displaySecondaryOptions();
				secondaryFunction();
				break;

			case "d":
				try {
					System.out.println("Thank you for using the application!");
					System.exit(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + takeUserSecondaryInput());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	
}
