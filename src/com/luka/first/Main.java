package com.luka.first;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        String route_to_my_dir = "C:\\Users\\luka1\\Desktop\\";
        String final_route = route_to_my_dir + "new-directory";

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
            for (int i=0; i<10; i++) {
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
}
