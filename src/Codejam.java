import Problems.Problem;
import Problems.ProblemA;

import java.lang.reflect.Constructor;
import java.util.ArrayList;


public class Codejam {
    public static void main(String[] args) {

        if(args[0] != null && args[1] != null) {
            String problemName = args[0];

            DataManager dm = new DataManager();
            String inputPath = args[1];
            String outputPath = inputPath.replace("in", "out");

            ArrayList<String> inputData = dm.getData(inputPath);

            try{

                Class<?> clazz = Class.forName("Problems." + problemName);
                Constructor<?> constructor = clazz.getConstructor(String.class);
                Object problemInstance = constructor.newInstance(problemName);

                ArrayList<String> outputData =  ((Problem)problemInstance).Resolve(inputData);
                dm.printFile(outputData, outputPath);
            }
            catch (Exception ex){
                System.out.println("Problem not found");
            }
        }
        else{
            System.out.println("Please enter problemName and inputPath parameters");
        }

    }
}
