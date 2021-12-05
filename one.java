import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class one {  
   public static void main(String[] args) {  
      try {  
         FileOutputStream os = new FileOutputStream("number.txt");  //creates new text file
         FileInputStream is = new FileInputStream("number.txt");  //opens the said file
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your number here: ");
         int num = input.nextInt();
         os.write(num);  //writes the integer inside the text file
         System.out.println("Your number has been saved!");
         os.close();
         System.out.println("**************************");
         System.out.println("Gathering Data...");
         System.out.print("" + (int) is.read());  //prints out the text from the file
         is.close();
         input.close();
      } 
      catch (Exception ex) {  
         ex.printStackTrace();  
      }  
   }  
}  