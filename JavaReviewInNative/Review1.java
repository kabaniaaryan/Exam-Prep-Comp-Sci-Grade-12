package JavaReviewInNative;
import java.io.*;

public class Review1{
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Give me a month");
        int intMonth = 0;
        try{
            intMonth = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println("Error");
        }catch(NumberFormatException e){
            System.out.println("Error");
        }

        System.out.println("Give me a day");
        int intDay = 0;
        try{
            intDay = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println("Error");
        }catch(NumberFormatException e){
            System.out.println("Error");
        }
        
        int intTotal = 0;

        if(intMonth == 1){
            intTotal = intDay;
        }else if(intMonth == 2){
            intTotal = 31 + intDay;
        }else if(intMonth == 3){
            intTotal = 31 + 28 + intDay;
        }else if(intMonth == 4){
            intTotal = 31 + 28 + 31 + intDay;
        }else if(intMonth == 5){
            intTotal = 31 + 28 + 31 + 30 + intDay;
        }else if(intMonth == 6){
            intTotal = 31 + 28 + 31 + 30 + 31 + intDay;
        }else if(intMonth == 7){
            intTotal = 31 + 28 + 31 + 30 + 31 + 30 + intDay;
        }else if(intMonth == 8){
            intTotal = 31 + 28 + 31 + 30 + 31 + 30 + 31 + intDay;
        }else if(intMonth == 9){
            intTotal = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + intDay;
        }else if(intMonth == 10){
            intTotal = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + intDay;
        }else if(intMonth == 11){
            intTotal = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + intDay;
        }else if(intMonth == 12){
            intTotal = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + intDay;
        }

        System.out.println(intTotal);
    }
}