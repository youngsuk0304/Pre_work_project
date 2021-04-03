package kr.or.connect.preworkproject.JsonData;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParcelJsonData {
	public static void main(String[] args) throws ParseException {
		 String jsonStr =
				"{\"parcel\": ["
				+	"{\"id\" :\"28\","
				+	"\"address\" : \"서울 강남구 논현동 262-32\","
	        	+	"\"geometry\" : \"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[[[127.03733594,37.51177792],[127.0374675,37.51181662],[127.03756493,37.51165919],[127.03743755,37.5116194],[127.03733594,37.51177792]]]}\","
		        +	"\"pnu\" : \"1168010800102620032\""
	        	+"}"
	        	+	"{\"id\" :\"29\","
				+	"\"address\" : \"서울 강남구 논현동 242-1\","
	        	+	"\"geometry\" : \"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[[[127.04010779,37.51585568],[127.04026063,37.5158905],[127.04031586,37.51573677],[127.04016472,37.51570114],[127.04010779,37.51585568]]]}\","
		        +	"\"pnu\" : \"1168010800102420001\""
	        	+"}"
	        	+ "]"
	        	+ "}";

		 try { 	
	        		JSONParser parser = new JSONParser();
	        		JSONObject jsonObj = (JSONObject) parser.parse(jsonStr);
	        		JSONArray memberArray = (JSONArray) jsonObj.get("parcel");

	        		for(int i=0;i<memberArray.size();i++) {
	        			JSONObject tempObj=(JSONObject) memberArray.get(i);
	        			System.out.println("id : "+tempObj.get("id"));
	        			System.out.println("address :"+tempObj.get("address"));
	        			System.out.println("geometry :"+tempObj.get("geometry"));
	        			System.out.println("pnu :"+tempObj.get("pnu"));
	        			System.out.println("--------------------------------");
	        		}
	        }catch (Exception e) {
				// TODO: handle exception
			}

	    }
}
