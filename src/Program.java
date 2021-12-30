
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		//IntList list = new IntList();
		//ObjectList list = new ObjectList();
		//GList<Integer> list = new GList<>();
		
		/*
		list.add(3);
		list.add(7);
		int size = list.size();
		System.out.printf("size: %d\n", size);
		list.clear();
		size = list.size();
		System.out.printf("size: %d\n", size);
		list.add(8);
		int num = list.get(0); // Object -> Integer
		System.out.printf("num: %d\n", num);
		//num = (Integer)list.get(1);
		*/
		
		/* 가변배열
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		for(int i=0; i<list.size(); i++)
			System.out.printf("list%d: %d\n", i+1, list.get(i));
		*/
		
		// collection (ArrayList, HashSet, HashMap)
		// ArrayList index로 꺼냄, 중복가능
		List<Integer> list = new ArrayList<>();
		list.add(1); // index0
		list.add(3); // index1
		list.add(4); // index2
		list.add(5); // index3
		list.add(6); // index4
		list.add(7); // index5
		System.out.println("list.get:: " + list.get(3));
		System.out.println("list.size:: " + list.size());
		
		// HashSet 중복불가 true or false
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(4);
		set.add(5);
		System.out.println("set.size:: " + set.add(5));
		System.out.println("set.size:: " + set.size());
		
		// HashMap key/value (속성/값)
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("id", 1);
		hm.put("title", "menu");
		hm.put("number", 3);
		hm.put("phone", 9890);
		System.out.println("number: " + hm.get("number"));
		System.out.println("title: " + hm.get("title"));
	}

}
