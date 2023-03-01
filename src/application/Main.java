package application;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "viny");
		cookies.put("email", "viny@gmail.com");
		cookies.put("phone", "11999999999");
		cookies.remove("email");
		cookies.put("phone", "11999999999");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println();
		System.out.println("All Cookies");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
	
}