package com.string.allmethods;

public class StringMethodsDemo {
	
	    public static void main(String[] args) {

	        String str = "  Hello Java World  ";
	        String str2 = "Hello";
	        String str3 = "java";
	        String str4 = "HELLO";

	        System.out.println("Original String: '" + str + "'");

	        // 1. length()
	        System.out.println("1. Length: " + str.length());

	        // 2. trim()
	        System.out.println("2. Trimmed: '" + str.trim() + "'");

	        // 3. toUpperCase(), toLowerCase()
	        System.out.println("3. Upper: " + str.toUpperCase());
	        System.out.println("4. Lower: " + str.toLowerCase());

	        // 4. charAt(index)
	        System.out.println("5. charAt(2): " + str.charAt(2));

	        // 5. substring(beginIndex, endIndex)
	        System.out.println("6. substring(2, 7): '" + str.substring(2, 7) + "'");

	        // 6. contains()
	        System.out.println("7. Contains 'Java': " + str.contains("Java"));

	        // 7. equals() and equalsIgnoreCase()
	        System.out.println("8. Equals 'Hello': " + str2.equals("Hello"));
	        System.out.println("9. Equals Ignore Case: " + str2.equalsIgnoreCase(str4));

	        // 8. startsWith(), endsWith()
	        System.out.println("10. Starts with '  He': " + str.startsWith("  He"));
	        System.out.println("11. Ends with 'ld  ': " + str.endsWith("ld  "));

	        // 9. indexOf(), lastIndexOf()
	        System.out.println("12. Index of 'Java': " + str.indexOf("Java"));
	        System.out.println("13. Last index of 'l': " + str.lastIndexOf("l"));

	        // 10. replace(), replaceAll()
	        System.out.println("14. Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

	        // 11. split()
	        String[] words = str.trim().split(" ");
	        System.out.print("15. Split: ");
	        for (String word : words) {
	            System.out.print("[" + word + "] ");
	        }
	        System.out.println();

	        // 12. isEmpty() and isBlank()
	        String emptyStr = "";
	        String blankStr = "   ";
	        System.out.println("16. Is empty: " + emptyStr.isEmpty());
	        System.out.println("17. Is blank: " + blankStr.isBlank());

	        // 13. concat()
	        System.out.println("18. Concat: " + str2.concat(" Programming"));

	        // 14. compareTo(), compareToIgnoreCase()
	        System.out.println("19. CompareTo: " + str2.compareTo(str3)); // 'H' vs 'j'
	        System.out.println("20. CompareToIgnoreCase: " + str2.compareToIgnoreCase(str3));

	        // 15. valueOf()
	        int num = 100;
	        String strNum = String.valueOf(num);
	        System.out.println("21. valueOf(100): " + strNum);

	        // 16. matches()
	        System.out.println("22. matches regex '[A-Za-z ]+': " + str.trim().matches("[A-Za-z ]+"));

	        // 17. repeat()
	        System.out.println("23. Repeat: " + str2.repeat(3));

	        // 18. join()
	        System.out.println("24. Join: " + String.join("-", "Java", "Python", "C++"));
	    }
	}

}
