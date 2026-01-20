package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion2 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me a position");
        int intPosition = 0;
        try{
            intPosition = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println(e.toString());
        }

        int intResult = seq2(intPosition);
        System.out.println(intResult);
    }

    public static int seq2(int intPos){
        if(intPos == 1){
            return 2;
        }else{
            return seq2(intPos -1) * 2;
        }
    }
}
