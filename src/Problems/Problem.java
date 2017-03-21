package Problems;

import java.util.ArrayList;

/**
 * Created by ajalv on 21/03/2017.
 */
public abstract class Problem {
    ArrayList<String> inputData, outputData;
    String problemName;

    public abstract ArrayList<String> Resolve(ArrayList<String> iData);
}
