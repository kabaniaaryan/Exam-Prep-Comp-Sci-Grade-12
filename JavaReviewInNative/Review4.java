package JavaReviewInNative;

import java.io.*;
public class Review4 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many items");
        int intItems = 0;
        try{
            intItems = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println(e.toString());
        }catch(NumberFormatException e){
            System.out.println("YOU STINKY BOY NO");
        }

        int intTotal = 0;
        int intPrice = 0;
        for(int intCount = 0; intCount < intItems; intCount++){
            System.out.println("Price of Item?");
            try{
                intPrice = Integer.parseInt(kb.readLine());
            }catch(IOException e){
                System.out.println(e.toString());
            }catch(NumberFormatException e){
                System.out.println("STINKY BOY NO");
            }
            
            intTotal = intTotal + intPrice;
        }

        System.out.println("The subtotal is: "+intTotal);
        System.out.println("The grand total is: "+intTotal*1.14);

    }
}
