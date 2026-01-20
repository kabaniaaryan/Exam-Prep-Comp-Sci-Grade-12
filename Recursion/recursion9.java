package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion9 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me a position");
        int intPosition = 0;
        try{
            intPosition = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println(e.toString());
        }

        int intResult = seq9(intPosition);
        System.out.println(intResult);
    }

    public static int seq9(int intPos){
        if(intPos == 1){
            return 4;
        }else if(intPos == 2){
            return -10;
        }else if(intPos == 3){
            return 5;
        }else{
            return seq9(intPos - 1) + seq9(intPos - 2) + seq9(intPos - 3);
        }
    }
}
