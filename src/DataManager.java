import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by ajalv on 21/03/2017.
 */
public class DataManager {
    public ArrayList<String> getData(String inputPath){
        ArrayList<String> data = new ArrayList<>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            String line;
            while ((line = reader.readLine()) != null)
            {
                data.add(line);
            }
            reader.close();
            return data;
        }
        catch (Exception e)
        {
            System.err.format("Error trying to read '%s'.", inputPath);
            e.printStackTrace();
            return null;
        }
    }

    public void printFile(ArrayList<String> outputData, String outputPath){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
            for (String line: outputData
                 ) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        }
        catch (Exception e)
        {
            System.err.format("Error trying to write '%s'.", outputPath);
            e.printStackTrace();
        }


    }
}
