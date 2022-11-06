import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader(
				"C:\\Users\\ragul\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Test.json");
		JSONParser jp = new JSONParser();
		Object parse = jp.parse(f);
		JSONObject jo = (JSONObject) parse;
		Object object = jo.get("email");
		System.out.println(object);
	}

}
