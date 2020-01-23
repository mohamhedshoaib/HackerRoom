//package HackerRoomSolutions.Hacker_room;
//
//
//import java.io.FileReader;
//import java.util.Map;
// 
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
// 
//import com.github.wnameless.json.flattener.JsonFlattener;
//import com.github.wnameless.json.unflattener.JsonUnflattener;
// 
//public class flatJson2 {
//	public static void main(String[] args) {
//		JSONParser parser = new JSONParser();
//		try {
// 
//			Object obj = parser.parse(new FileReader("./resources/json.json"));
//			JSONObject jsonObject = (JSONObject) obj;
// 
//			// JsonFlattener: A Java utility used to FLATTEN nested JSON objects
//			String flattenedJson = JsonFlattener.flatten(jsonObject.toString());
//			log("Flatten json \n" + flattenedJson);
// 
////			Map<String, Object> flattenedJsonMap = JsonFlattener.flattenAsMap(jsonObject.toString());
//// 
////			log("\n=====Flatten As Map=====\n" + flattenedJson);
////
////			flattenedJsonMap.forEach((k, v) -> log(k + " : " + v));
// 
//			// Unflatten it back to original JSON
//			String nestedJson = JsonUnflattener.unflatten(flattenedJson);
//			System.out.println("\nUnflatten JSON  \n" + nestedJson);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
// 
//	private static void log(String flattenedJson) {
//		System.out.println(flattenedJson);
// 
//	}
//}