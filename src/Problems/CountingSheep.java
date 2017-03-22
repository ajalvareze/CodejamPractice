package Problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ajalv on 21/03/2017.
 * Problem A. Counting Sheep
 * Qualification Round 2016
 */
public class CountingSheep extends Problem {
    Boolean[] countedDigits;

    public CountingSheep(String pName){
        problemName = pName;
    }

    public ArrayList<String> Resolve(ArrayList<String> iData){
        //stop when al digits have been counted
        countedDigits = new Boolean[10];


        inputData = iData;
        loadTestCases();

        outputData = new ArrayList<String>();

        for (int i=0; i<getTests(); i++
             ) {
            Arrays.fill(countedDigits, Boolean.FALSE);
            //count
            int Numb = Integer.parseInt(inputData.get(i));
            if(Numb != 0){
                int lastCounted = 0;
                while (!allDigitsCounted()){
                    lastCounted += Numb;

                    //count digits of number
                    char[] stringNumber = Integer.toString(lastCounted).toCharArray();
                    for (char dig: stringNumber
                         ) {
                        if (!countedDigits[Character.getNumericValue(dig)]){
                            countedDigits[Character.getNumericValue(dig)] = true;
                        }
                    }
                }
                outputData.add("Case #" + (i+1) +": " + lastCounted);
            }
            else{
                outputData.add("Case #" + (i+1) +": INSOMNIA");
            }
        }

        return outputData;
    }

    //Check if all the digits have been counted
    public boolean allDigitsCounted(){
        boolean areAllCounted = true;
        for (boolean digit: countedDigits
             ) {
            if(!digit)
                areAllCounted = digit;
        }
        return areAllCounted;
    }
}
