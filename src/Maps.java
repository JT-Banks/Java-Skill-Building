import java.util.Map;

public class Maps {

	/* Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. 
	 * In all cases remove the key "c", leaving the rest of the map unchanged.
	 * 
	 * Test cases:
	 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) --> {"a": "aaa", "b": "aaa"}
	 * mapShare({"b": "xyz", "c": "ccc"}) --> {"b": "xyz"}
	 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) --> {"a": "aaa", "b": "aaa", "d": "hi"}
	 */

	public Map<String, String> mapBully(Map<String, String> map) {

		if(map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

	/* Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
	 * In all cases remove the key "c", leaving the rest of the map unchanged.
	 * 
	 * Test Cases:
	 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) --> {"a": "aaa", "b": "aaa"}
	 * mapShare({"b": "xyz", "c": "ccc"}) --> {"b": "xyz"}
	 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) --> {"a": "aaa", "b": "aaa", "d": "hi"}
	 */

	public Map<String, String> mapShare(Map<String, String> map) {

		if(map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		if(map.containsKey("c")) {
			map.remove("c");
		}

		return map;
	}

	/* Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. 
	 * If both keys are present, append their 2 string values together and store the result under the key "ab".
	 * 
	 * Test cases:
	 * mapAB({"a": "Hi", "b": "There"}) --> {"a": "Hi", "ab": "HiThere", "b": "There"}
	 * mapAB({"a": "Hi"}) --> {"a": "Hi"}
	 */

	public Map<String, String> mapAB(Map<String, String> map) {

		if(map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}
}
