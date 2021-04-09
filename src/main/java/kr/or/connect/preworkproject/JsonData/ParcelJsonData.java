package kr.or.connect.preworkproject.JsonData;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import kr.or.connect.preworkproject.main.ParcelPart;

public class ParcelJsonData {
	public static void main(String[] args) throws ParseException {
		String jsonStr = "{\"parcel\": [" + "{\"id\" :\"28\"," + "\"address\" : \"서울 강남구 논현동 262-32\","
				+ "\"geometry\" : \"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[[[127.03733594,37.51177792],[127.0374675,37.51181662],[127.03756493,37.51165919],[127.03743755,37.5116194],[127.03733594,37.51177792]]]}\","
				+ "\"pnu\" : \"1168010800102620032\"" + "}" + "{\"id\" :\"29\"," + "\"address\" : \"서울 강남구 논현동 242-1\","
				+ "\"geometry\" : \"{\\\"type\\\":\\\"Polygon\\\",\\\"coordinates\\\":[[[127.04010779,37.51585568],[127.04026063,37.5158905],[127.04031586,37.51573677],[127.04016472,37.51570114],[127.04010779,37.51585568]]]}\","
				+ "\"pnu\" : \"1168010800102420001\"" + "}" + "]" + "}";

		try {
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject) parser.parse(jsonStr);
			JSONArray memberArray = (JSONArray) jsonObj.get("parcel");
			ParcelPart pt = new ParcelPart();
			for (int i = 0; i < memberArray.size(); i++) {
				JSONObject tempObj = (JSONObject) memberArray.get(i);
				int Id = Integer.parseInt(tempObj.get("id").toString());
				String Address = tempObj.get("address").toString();
				String Geometry = tempObj.get("geometry").toString();
				String Pnu = tempObj.get("pnu").toString();
				System.out.println("id : " + Id);
				System.out.println("address : " + Address);
				System.out.println("geometry : " + Geometry);
				System.out.println("pnu : " + Pnu);
				System.out.println("--------------------------------");
				pt.parcelAdd(Id, Address, Geometry, Pnu);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
