/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author eh155
 */
public class FileUtility {

    //class to create files, read and write 
    public static String readMotd() {
        String motd = null;
        try {
            //creating a new file motd: message of the day if does not exist
            File file = new File("motd.txt");
            file.createNewFile();

            //open a text file for input
            FileReader fr = new FileReader("motd.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                //updates to the last line in file
                if (line != null) {
                    motd = line;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error in reading from the file");

        }
        return motd;
    }

    // write motd to show on the system 
    public static void writeMotd(String motd) {
        try {
            //opening the file
            FileOutputStream fos = new FileOutputStream("motd.txt");
            PrintWriter pw = new PrintWriter(fos);

            //writing to the file 
            pw.write(motd);
            //flush the buffer
            pw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static String readHours() {
        String hours = null;
        try {
            //creating a new file 
            File file = new File("hours.txt");
            file.createNewFile();

            //open a text file for input
            FileReader fr = new FileReader("hours.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                //printing each line to console
                System.out.println(line);

            }
        } catch (IOException ex) {
            System.out.println("Error in reading from the file");

        }
        return hours;
    }

    public static void writehours(String hours) {
        try {
            //opening the file
            FileOutputStream fos = new FileOutputStream("./hours.txt");
            PrintWriter pw = new PrintWriter(fos);

            //writing to the file 
            pw.write(hours);
            //flush the buffer
            pw.close();
        } catch (IOException e) {
            System.out.println("Can't read the file");
        }
    }
    
}
