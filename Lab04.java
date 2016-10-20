
/*
 * Documentation: In this lab we were able to import a CSV file and then able to read it and parse it .
 * we used arraylists for saving it in different cells and for easy finding of cities.
 * Approach: We used "The Great Circle Distance Formula" for the caluclation of the distances
 * between two cities. Both were implemented in classes.
 * The problem with my task was that I couldn't pick the rows instead I picked columns from CSV.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CsvFile.readfile(args);
        
        
    }
    
}
