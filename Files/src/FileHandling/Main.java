package FileHandling;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//fetching a file
		//try-catch method
//		File fileObj1 = new File("C:\\Users\\sharm\\Downloads\\Upasana_Sharma_Resume.txt");
//		try {
//			if (fileObj1.createNewFile()) {
//				System.out.println("New file Created");
//			}
//			else{
//				System.out.println("Already exists");
//			}
//		}catch (FileNotFoundException ex) {
//			ex.printStackTrace();
//		}
//		//METHOd TO WRITE INSIDE A FILE 
//		FileWriter fWrite = new FileWriter("C:\\Users\\sharm\\Downloads\\Upasana_Sharma_Resume.txt");
//		
//		fWrite.append("Appending2 to the Java file" + "\n");
//		//append erases the data before written in it, if accompanied solo
//		fWrite.close();
		//BUFFERED WRITED 
		//Writing using a buffered writer is faster as it writes all at once
		
//		FileWriter file = new FileWriter("C:\\Users\\sharm\\Downloads\\Upasana_Sharma_Resume.txt");
//		String data = "";
//		BufferedWriter bf = null;
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("Enter the content : ");
//			bf = new BufferedWriter(file);
//			while(data.contentEquals("/")) {
//				data = sc.nextLine();
//				bf.write(data,0,data.length());
//				bf.newLine();				
//			}
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (bf != null) {
//                    bf.close();
//                }
//                if (file != null) {
//                    file.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//            sc.close();
//        }
		
		//reading the content of the file
		//done by creating a string of data
//		File file = new File("C:\\Users\\sharm\\Downloads\\Upasana_Sharma_Resum.txt");
//		Scanner myReader = new Scanner(file);
//		while (myReader.hasNextLine()) {
//			String data = myReader.nextLine();
//			System.out.println(data);
//		}
//		myReader.close();
		
		//using fileReader
		//storing in array
		char[] array = new char[100];
		try {
			FileReader readFile = new FileReader("C:\\Users\\sharm\\Downloads\\Upasana_Sharma_Resum.txt");
			readFile.read(array);
			System.out.println("Content :");
			System.out.println(array);
			readFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

			
		//deleting a file
		File filedelete = new File("C:\\\\Users\\\\sharm\\\\Downloads\\\\Upasana_Sharma_Resum.txt");

		// deletes the file
		boolean value = filedelete.delete();
		if (value) {
			System.out.println("The File is deleted.");
		} else {
			System.out.println("The File is not deleted.");
		}
		}
	}


