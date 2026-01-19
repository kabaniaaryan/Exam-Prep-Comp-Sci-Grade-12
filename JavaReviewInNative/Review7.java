package JavaReviewInNative;

import java.io.*;
public class Review7 {
    public static void main(String[] args){
        BufferedReader kb = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Give me a sentence");
        String theSentence = null;
        try{
            theSentence = kb.readLine();
        }catch(IOException e){
            System.out.println(e.toString());
        }

        //length
        int intLength = theSentence.length();

        //spaces
        int intSpaces = 0;
        int intLetterA = 0;
        for(int intCount = 0; intCount < intLength; intCount++){
            if(theSentence.substring(intCount, intCount+1).equals(" ")){
                intSpaces +=1;
            }else if(theSentence.substring(intCount, intCount+1).equals("a")){
                intLetterA +=1;
            }
        }

        System.out.println("The length is: "+intLength);
        System.out.println("The Spaces is: "+intSpaces);
        System.out.println("The Letter A is: "+intLetterA);

        String strNew = "";
        for(int intCount2 = 0; intCount2 < intLength; intCount2++){
            if(intCount2%2 == 0){
                strNew = strNew + theSentence.substring(intCount2, intCount2+1);
            }
        }

        System.out.println(strNew);

    }

    
}
