package JavaReviewInNative;

import java.io.*;
public class Review5 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int intValue = 30;
        int intGuess = 0;
        boolean blnGuessed = false;

        while(blnGuessed != true){
            System.out.println("Guess a number");
            try{
                intGuess = Integer.parseInt(kb.readLine());
            }catch(IOException e){
                System.out.println(e.toString());
            }catch(NumberFormatException e){
                System.out.println(e.toString());
            }

            if(intValue == intGuess){
                System.out.println("Correct");
                blnGuessed = true;
            }
        }
    }
}
