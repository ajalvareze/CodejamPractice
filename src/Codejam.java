import Problems.Problem;
import Problems.ProblemA;

import java.util.ArrayList;

/**
 * Created by ajalv on 21/03/2017.
 */
public class Codejam {
    public static void main(String[] args) {

        if(args[0] != null && args[1] != null) {
            String problemName = args[0];

            DataManager dm = new DataManager();
            String inputPath = args[1];
            String outputPath = inputPath.replace("in", "out");

            ArrayList<String> inputData = dm.getData(inputPath);
            Problem problem = new ProblemA(problemName);
            ArrayList<String> outputData = problem.Resolve(inputData);
            dm.printFile(outputData, outputPath);
        }
        else{
            System.out.println("Please enter problemName and inputPath parameters");
        }

    }
}
