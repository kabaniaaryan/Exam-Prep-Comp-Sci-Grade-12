package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion8 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me a position");
        int intPosition = 0;
        try{
            intPosition = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println(e.toString());
        }

        int intResult = seq8(intPosition);
        System.out.println(intResult);
    } 

    public static int seq8(int intPos){
        if(intPos == 1){
            return 2;
        }else if(intPos == 2){
            return -1;
        }else if (intPos == 3){
            return 3;
        }else{
            return seq8(intPos - 1) * seq8(intPos - 2) * seq8(intPos - 3);
        }
    }
}
