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
		if (numbers == null || numbers.size() < 1) {
			return -1;
		} else {
			int max = numbers.get(0);
			int min = numbers.get(0);
			for (int i = 1; i < numbers.size(); i++) {
	             if (numbers.get(i) > max) {
	            	 max = numbers.get(i);
	             }
	             if (numbers.get(i) < min) {
	            	 min = numbers.get(i);
	             }
			}
			return max-min;
		}
	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		} else {
			for(int i = 0; i < numbers.size(); i++) {
				if(numbers.get(i) < 0) {
					return -1;
				}
			}
			double first = numbers.get(0);
			double middle = numbers.get(numbers.size()/2);
			double last = numbers.get(numbers.size()-1);
			if(first > middle && first > last) {
				return first;
			} else if (middle > first && middle > last) {
				return middle;
			} else if (last > first && last > middle) {
				return last;
			} else if (first == middle && middle == last) {
				return first;
			}
		}
		return -1;
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		ArrayList<String> empty = new ArrayList<String>();
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return empty;
		} else {
			for(int i = 0; i < values.size(); i++) {
				if(values.get(i) == null) {
					return empty;
				}
			}
			int middleInt = values.size()-1;
			String first = values.get(middleInt/2-1);
			String middle = values.get(middleInt/2);
			String last = values.get(middleInt/2+1);
			ArrayList<String> newArray = new ArrayList<String>(3);
			newArray.add(first);
			newArray.add(middle);
			newArray.add(last);
			return newArray;
		}
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		} else {
			for(int i = 0; i < numbers.size()-2; i++) {
				if(numbers.get(i) == numbers.get(i+1)-1 && numbers.get(i+1) == numbers.get(i+2)-1) {
					return true;
				}
			}
			return false;
		}
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		} else {
			int correct = 0;
			for(int i = 0; i < numbers.size()-3; i++) {
				if((numbers.get(i) == x && numbers.get(i+2) == x) || (numbers.get(i) == x && numbers.get(i+3) == x)) {
					correct += 1;
				}
			}
			if(correct > 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		} else {
			int correct = 0;
			for(int i = 0; i < numbers.size()-2; i++) {
				if((numbers.get(i) % 2 == 0 && numbers.get(i+1) % 2 == 0 && numbers.get(i+2) % 2 == 0) || numbers.get(i) % 2 == 1 && numbers.get(i+1) % 2 == 1 && numbers.get(i+2) % 2 == 1) {
					correct += 1;
				}
			}
			if(correct > 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) {
			return false;
		} else {
			int left = 0;
			int right = 0;
			for(int x = 0; x < numbers.size(); x++) {
				right += numbers.get(x);
			}
			for(int i = 0; i < numbers.size()-1; i++) {
				if(left != right) {
					left += numbers.get(i);
					right -= numbers.get(i);
			    }
			}
		return left==right;
		}
	}

	public int clumps(ArrayList<String> values) {
		if (values == null) {
			return -1;
		} else {
			int clumps = 0;
			boolean isClump = false;
		  for(int i = 0; i < values.size() - 1; i++) {
			  if (isClump) {
				  if(!values.get(i).equals(values.get(i+1))) {
					  isClump = false;
				  }
			  } else if (values.get(i).equals(values.get(i+1))) {
				  isClump = true;
				  clumps++;
			  }
		  }
		  return clumps;
		}
	}
}
