import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anas
 */
public class CsvFile {
    
    public static String[][] myArray = new String[702][3];
    
    public static void readfile(String[] args) {
        int row = 0;
     int col = 0;
    String fileName = "C:\\Users\\Anas Khalid\\Downloads\\Academic _Schedule.csv";
        File file = new File(fileName);
        try{
            Scanner input = new Scanner(new BufferedReader (new FileReader(file)));
            while(input.hasNextLine()){
                String data = input.nextLine();
                String[] array = data.split(",");
                
                for(int x=0; x<array.length; x++)
                {
                    myArray[row][x] = array[x];
                }
                row++;
            }
           
            input.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
