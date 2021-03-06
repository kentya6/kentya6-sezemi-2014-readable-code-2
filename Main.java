import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
 
		try {	 
			Object parseObject = parser.parse(new FileReader("CookData.json"));
			JSONObject jsonObject = (JSONObject)parseObject;
			String recipeName = (String)jsonObject.get("RecipeName");
			System.out.println(recipeName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}