package apis;

import java.io.IOException;

import org.json.JSONObject;

import api.Api;
import api.JsonParser;

public class Champion {
	public Champion() {

	}
	
	public JSONObject DadosAPI(String championName) throws IOException {
		String url = String.format("http://ddragon.leagueoflegends.com/cdn/10.14.1/data/pt_BR/champion/%s", championName);
		url = url+".json";
		Api api = new Api(url);
		JSONObject json = JsonParser.parseToObject(api.executar());
		return json;
	}
	
}
