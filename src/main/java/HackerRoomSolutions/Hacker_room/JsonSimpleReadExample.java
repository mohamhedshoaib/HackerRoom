package HackerRoomSolutions.Hacker_room;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;

public class JsonSimpleReadExample {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        JSONObject writerJsonObj = new JSONObject();
        try (Reader reader = new FileReader(".//resources/testJWriter.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println("object is " + jsonObject);
//            =====Simple Flatten===== 
//            	{"name":"shoaib","messages[0]":"msg 1","messages[1]":"msg 2","messages[2]":"msg 3","age":100}
            	
            	jsonObject.keySet().forEach(keyStr ->
            	{
            		Object keyvalue = jsonObject.get(keyStr);
            		System.out.println("key: "+ keyStr + " value: " + keyvalue);
                
            		if (keyvalue instanceof JSONArray)
            		{
	                  // it's an array
	                  System.out.println("object is array");
	                  JSONArray msg = (JSONArray) jsonObject.get(keyStr);
	                  Iterator<String> iterator = msg.iterator();
	                  
	                  int i = 0;
	                  while (iterator.hasNext()) {
	                	  System.out.println("i is "+i);
	                	  String arrVal = iterator.next();
	                	  System.out.println("Array " +i + " val " + arrVal);
	                	  String currentKey = (String)keyStr + "["+i+"]";
	                	  writerJsonObj.put(currentKey, arrVal);
	                	 i++;
	                  }
	                  // do all kinds of JSONArray'ish things with urlArray
	               } else {
	                  // if you know it's either an array or an object, then it's an object
//	                  String urlObject = (String) keyvalue;
	                  System.out.println("object is obejct" + keyvalue);
	                 writerJsonObj.put(keyStr, keyvalue);
	              }
                });
           System.out.println(writerJsonObj);

       } catch(Exception e){
    	   System.out.println("error " + e.getMessage().toString());
       }
        
        
    }
}