package Problems;

import java.util.ArrayList;

/**
 * Created by ajalv on 21/03/2017.
 * Example problem
 */
public class ProblemA extends Problem {
    public ProblemA(String pName){
        problemName = pName;
    }

    public ArrayList<String> Resolve(ArrayList<String> iData){
        inputData = iData;
        outputData = inputData;
        return outputData;
    }
}
