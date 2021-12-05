import java.io.*;
import java.util.Scanner;
public class two {
    public static void main(String []args)throws Exception{
        try
        {
            Scanner input=new Scanner(System.in);
            //variables
            String text, out; 
            int shift;
            char car;

            //asking user which file and size of shift
            System.out.print("Input the title of the file you want to encrypt: ");
            text=input.next();
            System.out.print("Shift size: ");
            shift=input.nextInt();
            System.out.print("Message read from the file: ");

            //getting the text inside the file
            FileInputStream is = new FileInputStream(text);
            BufferedReader os = new BufferedReader(new InputStreamReader(is));
            out = os.readLine();
            System.out.println(out);

            System.out.print("Encrypted message: ");
            int lnt = out.length(); //size of the text inside the file
            int asc[] = new int[lnt];   //stores the ascii of the text
            int asc1[] = new int[lnt];  //stores the ascii of the shifted text
            char message; //stores the encrypted text

            for (int i = 0; i<lnt; i++)
            {
                car = out.charAt(i);    //stores each element on the variable car
                asc[i] = (int) car;     //translate the said element to ascii
                asc1[i] = asc[i]+shift; //shifts ascii
                message =(char) asc1[i]; //translates the ascii to char
                System.out.print(message); //print outs the encrypted texts      
            }
            os.close();
            is.close();
            input.close();
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}