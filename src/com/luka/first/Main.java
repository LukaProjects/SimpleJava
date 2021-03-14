package com.luka.first;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner directory = new Scanner(System.in);

        String directory_name;
        int numberOfFiles;

        String route_to_my_dir = "C:\\Users\\luka1\\Desktop\\";

        System.out.println("Enter a directory name: ");
        directory_name = directory.nextLine();

        String final_route = route_to_my_dir + directory_name;   // User defined directory name
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String date_formatted = myDate.format(formatted);
        File myFile = new File(final_route);

        // Verification for directory creation
        if (myFile.mkdir()){
            System.out.println("Directory created at: " + date_formatted );
        }
        else {
            System.out.println("Directory cannot be created.");
        }

        try {
            System.out.println("Enter a number of files you want to create: ");
            numberOfFiles = scanner.nextInt();

            for (int i=0; i<numberOfFiles; i++) {    // creating a user defined number of files inside of a wanted directory
                String filename = "file" + i + ".txt";
                File f = new File(final_route + "\\" + filename);
                if (f.createNewFile()){
                    System.out.println("File created at: " + date_formatted);
                }
                else {
                    System.out.println("File already exits");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void directoryDelete() {   // Add this features

    }

    public static void specificFileDelete() {

    }
}
