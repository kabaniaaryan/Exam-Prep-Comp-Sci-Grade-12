package Recursion;

import java.io.*;
public class recursion1 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me a position");
        int intPosition = 0;
        try{
            intPosition = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println(e.toString());
        }

        int intResult = seq1(intPosition);
        System.out.println(intResult);


    }

    public static int seq1(int intPos){
        if(intPos == 1){
            return 1;
        }else{
            return seq1(intPos - 1) + 2;
        }
    }
    
}
