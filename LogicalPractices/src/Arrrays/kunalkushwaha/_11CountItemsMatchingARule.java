package Arrrays.kunalkushwaha;

import java.util.List;

public class _11CountItemsMatchingARule {


	    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        int keyIndex = 0;

	        // Determine which index to check based on ruleKey
	        if (ruleKey.equals("color")) {
	            keyIndex = 1;
	        } else if (ruleKey.equals("name")) {
	            keyIndex = 2;
	        }

	        int count = 0;
	        for (List<String> item : items) {
	            if (item.get(keyIndex).equals(ruleValue)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        List<List<String>> items1 = List.of(
	                List.of("phone", "blue", "pixel"),
	                List.of("computer", "silver", "lenovo"),
	                List.of("phone", "gold", "iphone")
	        );

	        int result1 = countMatches(items1, "color", "silver");
	        System.out.println("Matching items (Example 1): " + result1);  // Output: 1

	        List<List<String>> items2 = List.of(
	                List.of("phone", "blue", "pixel"),
	                List.of("computer", "silver", "phone"),
	                List.of("phone", "gold", "iphone")
	        );

	        int result2 = countMatches(items2, "type", "phone");
	        System.out.println("Matching items (Example 2): " + result2);  // Output: 2
	    }
	}


