package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion5 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me a position");
        int intPosition = 0;
        try{
            intPosition = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println(e.toString());
        }

        int intResult = seq5(intPosition);
        System.out.println(intResult);
    }

    public static int seq5(int intPos){
        if(intPos == 1){
            return 1;
        }else{
            return seq5(intPos - 1) + intPos;
        }
    }
}
