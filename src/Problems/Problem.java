package Problems;

import java.util.ArrayList;

/**
 * Created by ajalv on 21/03/2017.
 */
public abstract class Problem {
    ArrayList<String> inputData, outputData;
    String problemName;
    private int tests;

    public abstract ArrayList<String> Resolve(ArrayList<String> iData);

    public void loadTestCases(){
        tests = Integer.parseInt(inputData.get(0));
        inputData.remove(0);
    }

    public int getTests() {
        return tests;
    }

    public void setTests(int tests) {
        this.tests = tests;
    }
}
