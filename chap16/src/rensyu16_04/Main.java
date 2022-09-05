package rensyu16_04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*List<Integer> exam1 = new ArrayList<Integer>();
		exam1.add(30);
		exam1.add(40);
		exam1.add(70);
		exam1.add(30);
		exam1.add(90);
		//Iterator<Integer> it1 = exam1.iterator();
		//while (it1.hasNext()) {
			//Integer e1 = it1.next();
		//}
		
		List<Integer> exam2 = new ArrayList<Integer>();
		exam2.add(70);
		exam2.add(90);
		exam2.add(100);
		exam2.add(85);
		exam2.add(90);
		//Iterator<Integer> it2 = exam2.iterator();
		//while (it2.hasNext()) {
			//Integer e2 = it2.next();
		//}
		
		Map<String, List<Integer>> result = new HashMap<>();
		result.put("田中", exam1);
		result.put("鈴木", exam2);
		for (String key : result.keySet()) {
			List<Integer> value = result.get(key);
			System.out.println(key + ":" + value);
		}*/
		
		List<ArrayList<Integer>> a = new ArrayList<>(); 
		
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
		al2.add(4);
		al2.add(5);
		al2.add(6);
		
		al3.add(7);
		al3.add(8);
		al3.add(9);
		System.out.println();
		for (ArrayList<Integer> obj : a) {
			for (Integer num : obj) {
				System.out.print(num + "");
			}
			System.out.println();
		}
		
		
	}

}
