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
	/* Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
	 * set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
	 *
	 * Test cases:
	 * topping1({"ice cream": "peanuts"}) --> {"bread": "butter", "ice cream": "cherry"}
	 * topping1({}) --> {"bread": "butter"}
	 * topping1({"pancake": "syrup"}) --> {"bread": "butter", "pancake": "syrup"}
	 */
	public Map<String, String> topping1(Map<String, String> map) {

		map.put("bread", "butter");

		if(map.containsKey("ice cream")) {
			map.replace("ice cream", "cherry");
		} 
		return map;
	}
	/* Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, 
	 * set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
	 * Test Cases:
	 * topping2({"ice cream": "cherry"}) --> {"yogurt": "cherry", "ice cream": "cherry"}
	 * topping2({"spinach": "dirt", "ice cream": "cherry"}) -> {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
	 * topping2({"yogurt": "salt"}) --> {"yogurt": "salt"}
	 */
	public Map<String, String> topping2(Map<String, String> map) {

		if(map.get("ice cream") != null) {
			map.put("yogurt", map.get("ice cream"));
		}
		if(map.get("spinach") != null)
			map.put("spinach", "nuts" );
		return map;
	}
	/* Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, 
	 * set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
	 *
	 * Test Cases:
	 * topping3({"potato": "ketchup"}) --> {"potato": "ketchup", "fries": "ketchup"}
	 * topping3({"potato": "butter"}) --> {"potato": "butter", "fries": "butter"}
	 * topping3({"salad": "oil", "potato": "ketchup"}) --> {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup" 
	 */
	public Map<String, String> topping3(Map<String, String> map) {

		if(map.get("potato") != null) {
			map.put("fries", map.get("potato"));
		}
		if(map.get("salad") != null) {
			map.put("spinach", map.get("salad"));
		}
		return map;
	}	
	/* Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
	 * remove them both.
	 * 
	 * Test Cases:
	 * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) --> {"c": "cake"}
	 * mapAB2({"a": "aaa", "b": "bbb"}) --> {"a": "aaa", "b": "bbb"}
	 * mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) --> {"a": "aaa", "b": "bbb", "c": "aaa"} 
	 */
	public Map<String, String> mapAB2(Map<String, String> map) {
		  
		if(map.containsKey("a") && map.containsKey("b")) {
			if(map.containsValue(map.get("a").compareTo(map.get("b")))) {
			map.put("b", map.get("a"));
			}
		}
		return map;
	}
}
