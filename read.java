//open file 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Scanner1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/csv_data.csv"));
        scanner.useDelimiter(", ");

        while(scanner.hasNext()){

            System.out.print(scanner.next()+"|");
        }
        scanner.close();
    }

}