package Challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public class challenges{

	public static void main(String[] args) {
		System.out.println("Enter number rows to be printed");
	
		int num = 5 ;
		starPattern(num);
		String str = "abxxyyzzyz";
		boolean check = checkEnglishAlphabates(str);
		if(check) {
			System.out.println("all english alphabates present at least once");
		}else {
			System.out.println("all english alphabates are not present at least once");
		}
		
		String str1 = "eeaabbccddffggfllppllazp";
		checkFirstNonRepeatating(str1);
	}

	private static void checkFirstNonRepeatating(String str1) {
	
		Map<Character, Integer>map = new LinkedHashMap<>();
		//Map<Character, Integer>map = new HashMap<>();
		for(Character c : str1.toLowerCase().toCharArray()) {
			
			if(map.containsKey(c))
			{
			map.put(c, map.get(c)+1);
		    }else {
		    	map.put(c, 1);
		    }
		}
		System.out.println(map);
		int count = 0;
		for(Entry<Character, Integer> set : map.entrySet()) {
			if(set.getValue() == 1) {
				count++;
				if(count ==1) {
					System.out.println(set);
				}
			
			}
		}//System.out.println(count);
		if(count ==0) {
			System.out.println("all Characters in string are repeate itself");
		}
		
	}

	private static boolean checkEnglishAlphabates(String str) {
		if(str.length() < 26)
		{
			return false;
		}

		Set<Character>set = new HashSet<>();
		for(Character c : str.toLowerCase().toCharArray()) {
			if(c >= 97 && c <= 122) {
				//System.out.println(c);
				set.add(c);
			}
		}
		if(set.size() >= 26) {
			System.out.println("inside set if");
			return true;
		}
		return false;
	}

	private static void starPattern(int num) {
		for(int i = 1; i<= num;i++ ) {
			
			for(int j =num  - i-1 ;j>=0;j--) {
				System.out.print("  ");//printing spaces
			}
		//	System.out.println();
			
			for(int k = 2 * i -1 ;k>0;k--) {
				System.out.print("*");//printing spaces
			}
			System.out.println();
		}
		
	}

}
