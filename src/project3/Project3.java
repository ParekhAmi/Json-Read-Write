package project3;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class Project3 {

    
    public static void main(String[] args) throws IOException {
        int[] ids={10,20,30,40,50};
        String[] names={"Ami","Monika","Farhin","Parag","Khushal"};
        double[] salaries={1000,2000,3000,4000,5000};
        
        JSONArray mainArray = new JSONArray();
        JSONObject obj1 = new JSONObject();
        
        for(int i=0;i<ids.length;i++){
            
           
            obj1.accumulate("id", ids[i]);
            obj1.accumulate("name", names[i]);
            obj1.accumulate("salary",salaries[i]);
            mainArray.add(obj1);
            obj1.clear();
        }
        FileWriter.saveStringIntoFile("json/example.json", mainArray.toString());
    }
    
}
