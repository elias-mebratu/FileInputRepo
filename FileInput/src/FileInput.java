
import java.io.File;//Import class to handle file operations
import java.io.FileNotFoundException;// Import class for  file not found error
import java.util.InputMismatchException ;// impeor class for invalid input type error
import java.util.Scanner; // Import Scanner to read data
public class FileInput {
	public static void main(String[]args) {
		// create a Scanner to read number from the file input.txt
		Scanner inputFile;
		try {
			System.out.println("Here is input file list ");
			inputFile = new Scanner(new File("input.txt"));
			int input;
			int sum = 0;
			while(inputFile.hasNextInt()) {
				input = inputFile.nextInt();
				sum += input;
				System.out.println(input);
			}
			System.out.println("The sum of the list = " + sum);
			inputFile.close();
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("Error: input.txt file not found!");
			System.out.println(ex.getMessage());
			
		}
		catch(InputMismatchException ex) {
			System.out.println("Error reading input");
			System.out.println(ex.getMessage());
			
		}
		
		
		
	}

}
