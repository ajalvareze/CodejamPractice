package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by ajalv on 24/03/2017.
 * 2016 Qualification Round
 */

public class RevengeOfThePancakes extends Problem {

    public RevengeOfThePancakes(String pName){
        problemName = pName;
    }

    public ArrayList<String> Resolve(ArrayList<String> iData){
        //stop when al digits have been counted
        inputData = iData;
        loadTestCases();

        outputData = new ArrayList<>();

        for (int i=0; i<getTests(); i++) {

            //count
            String Stack = inputData.get(i);
            int flips = 0;
            while(!isHappy(Stack)){
                int sectionBreak = checkBreak(Stack);

                if(sectionBreak != -1){
                    String flippedStack = flip(Stack.substring(0,sectionBreak));
                    String restOfStack = Stack.substring(sectionBreak);
                    Stack = flippedStack + restOfStack;
                }
                else{
                    Stack = flip(Stack);
                }
                flips++;
            }
            outputData.add("case #" + (i+1) + ": " + flips);
        }
        return outputData;
    }

    int checkBreak(String Stack){
        if(Stack.length() > 1)
        {
            char[] cookies = Stack.toCharArray();
            for (int i = 0;  i < cookies.length - 1; i++) {
                if (cookies[i] != cookies[i+1] ){
                    return i+1;
                }
            }
            return -1;
        }
        else {
            return -1;
        }
    }

    //flips the stack received
    String flip(String Stack){
        String flippedCookies = "";
        char[] cookies = Stack.toCharArray();
        for (int i = cookies.length - 1; i >= 0; i--) {
            if (cookies[i] == '-' ){
                flippedCookies += "+";
            }
            else{
                flippedCookies += "-";
            }
        }
        return  flippedCookies;
    }

    boolean isHappy(String Stack){
        boolean happy;
        char[] cookies = Stack.toCharArray();
        for (char cookie : cookies
                ) {
            if (cookie == '-'){
                return false;
            }
        }
        return true;
    }
}