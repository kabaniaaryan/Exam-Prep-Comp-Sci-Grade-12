package JavaReviewInNative;
import java.io.*;

public class Review2 {
    public static void main(String[] args){

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("0 - Joke About Hair \n1 - Joke About Feet \n2 - Joke About Clothes \n3 - Joke About Teacher");
        int intChoice = 0;
        try{
            intChoice = Integer.parseInt(kb.readLine());
        }catch(IOException e){
            System.out.println(e.toString());
        }

        switch(intChoice){
            case (0): System.out.println("UR HAIR BAD");
                break;
            case (1): System.out.println("UR FEET STINK");
                break;
            case(2): System.out.println("UR CLOTHES UGLYY");
                break;
            case(3): System.out.println("ur teacher is the wrost");
                break;

        }
    }
}
