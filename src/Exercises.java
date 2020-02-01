import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		} else if (a.get(0) == b.get(0) || a.get(a.size()-1) == b.get(b.size()-1)) {
			return true;
		}
		return false;
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n < 1) {
			ArrayList empty = new ArrayList();
 			return empty;
 		} else {
			ArrayList newArray = new ArrayList(n*2);
 			int x = n;
 			for(int i = 0; i < n; i++) {
 				newArray.add(values.get(i));
 			}
 			for(int i = values.size()-n; i < values.size(); i++) {
 				newArray.add(values.get(i));
 				x++;
 			}
 			return newArray;
 		}
	}

	public int difference(ArrayList<Integer> numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
