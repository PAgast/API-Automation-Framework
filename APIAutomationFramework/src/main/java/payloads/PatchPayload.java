package payloads;

import java.util.HashMap;
import java.util.Map;

public class PatchPayload {

	public static Map<String,Object> updateFirstName() {
		
		Map<String,Object> payload = new HashMap<>();
		
		payload.put("firstname", "Priya");
		return payload;
		
		
	}
}
