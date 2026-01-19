package JavaReviewInNative;

import java.io.*;
public class Review6 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int intPrice = 1;
        int intTotal = 0;
        while(intPrice != 0){
            System.out.println("Price of the Item?");
            try{
                intPrice = Integer.parseInt(kb.readLine());
            }catch(IOException e){
                System.out.println(e.toString());
            }

            intTotal = intTotal + intPrice;
        }

        System.out.println("The subtotal is: "+intTotal);
        System.out.println("The grand total is: "+intTotal * 1.14);
    }
}
