import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLoader {
    public static ArrayList<String> loadTransactions(String filename){
        ArrayList<String> transactions = null;
        String sep = File.separator;

        try(Scanner fr = new Scanner(new File("src" + sep  + filename))){
            transactions = new ArrayList<>(10000);
            while(fr.hasNextLine()) transactions.add(fr.nextLine());
        }
        catch(FileNotFoundException _){
            System.out.printf("Could not find file '%s'.\n" +
                    "Did you place the transaction file in your 'src' folder?\n" +
                    "Did you pass this method the correct file name?\n"
                    , filename);
        }
        catch(Exception e){
            System.out.printf("An unknown error has occurred: %s\n",
                                e.getMessage());
        }

        return transactions;
    }
}
