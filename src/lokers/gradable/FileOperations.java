package lokers.gradable;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperations {

	String path;
	Scanner scanner;

	File file;

	// method to set directory path given by user.
	public void takeDirectoryPath() {
		System.out.println("\tPlease enter a directory path to work with: \n");
		scanner = new Scanner(System.in);
		String path = scanner.next();
		file = new File(path);
		if (file.isDirectory()) {
			this.path = path;
		} else {
			System.out.println("This is not a directory. Please try again...");
			takeDirectoryPath();
		}

	}

	public void getFileList() {
		file = new File(path);
		String arr[] = file.list();
		Arrays.sort(arr);
		System.out.println("The File names are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public String addFile(String fileName) {
		try {
			File file = new File(path + fileName + ".txt");
			if (file.createNewFile()) {
				System.out.println("File created..");

			} else if (file.exists()) {
				System.out.println("File exists already..");
			} else {
				System.out.println("File can not be added..");
			}
		} catch (Exception e) {
			System.out.println("Exception occured..");
		}
		return null;
	}

	public String deleteFile(String fileName) {
		try {
			File file = new File(path + fileName + ".txt");
			if (file.exists()) {
				boolean b = file.delete();
				if (b == true) {
					System.out.println("File deleted..");
				} else {
					System.out.println("File not found");
				}
			} else {
				System.out.println("No such file found..");
			}
		} catch (Exception e) {
			System.out.println("Exception cought.");
		}
		return null;
	}

	public void searchFile(String fileName) {
		try {
			File file = new File(path + fileName + ".txt");
			if (file.exists()) {
				System.out.println("File found.." + fileName);

			} else {
				System.out.println("There is no file with this name.");
			}

		} catch (Exception e) {
			System.out.println("Pattern mismatch.");
		}
	}

}
