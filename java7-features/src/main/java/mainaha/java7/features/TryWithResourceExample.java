package mainaha.java7.features;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) {

		// Define your input and output file paths
		String inputFilePath = "D:\\2026_java_notes\\input.txt";
		String outputFilePath = "D:\\\\2026_java_notes\\\\output.txt";

		// Try-with-resources automatically closes files to avoid resource leaks
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
			String line;

			// Read line-by-line until the end of the file is reached
			while ((line = reader.readLine()) != null) {
				writer.write(line);

				// Add a platform-specific newline character after each line
				writer.newLine();
			}

			System.out.println("File read and write operation completed successfully.");

		} catch (IOException e) {
			System.err.println("An error occurred during file I/O: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
