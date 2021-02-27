import java.util.HashMap;

public class CodingBat {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		Maps mapExercises = new Maps();
		map.put("potato", "ketchup");
		System.out.println(mapExercises.topping3(map));
	}
}