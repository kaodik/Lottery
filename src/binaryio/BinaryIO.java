
package binaryio;
import java.io.*;
import java.util.Scanner;


public class BinaryIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] lottoPick = {12, 60, 81, 32, 27};
        //FileOutputStream object,Data outputSteam
        FileOutputStream binaryLottoFile = new FileOutputStream("todaysPicks.txt");
        DataOutputStream binaryLottoWriter = new DataOutputStream(binaryLottoFile);
        
        for( int i : lottoPick)
            binaryLottoWriter.writeInt(i);
        
        binaryLottoWriter.close();
        System.out.println("File Saved");
    }
    
}
