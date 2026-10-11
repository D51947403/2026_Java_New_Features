package mainaha.java7.features;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class NioFileSystemAPIExample {
	
   //// Works with forward slashes on windows 
	 static Path filePath = Paths.get("D:/2026_java_notes/input.txt");
	 static Path dirPath = Paths.get("D:/Mission2020-not completed");
	public static void main(String[] args) {
		// readAllLinesAtoOnce();
		// readLargeFileSequentially();
		//readFolders();
		readRecursiveFolderExample();
	}
	
	public static void readAllLinesAtoOnce() {
		try {
            // Reads all lines using UTF-8 encoding
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
	}

	public static void readLargeFileSequentially() {
		 // Try-with-resources ensures the reader closes automatically
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public static void readFolders() {
		 // DirectoryStream must be closed, so use try-with-resources
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
            for (Path entry : stream) {
                // Check if it's a directory or a file
                String type = Files.isDirectory(entry) ? "[DIR] " : "[FILE]";
                System.out.println(type + " " + entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void readRecursiveFolderExample () {
		 try {
	            Files.walkFileTree(dirPath, new SimpleFileVisitor<Path>() {
	                @Override
	                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
	                    System.out.println("File: " + file);
	                    return FileVisitResult.CONTINUE;
	                }

	                @Override
	                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
	                    System.out.println("Directory: " + dir);
	                    return FileVisitResult.CONTINUE;
	                }
	            });
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
