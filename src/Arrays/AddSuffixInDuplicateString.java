package Arrays;

import java.util.*;

public class AddSuffixInDuplicateString {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        List<String> result = addSuffixToDuplicates(items);

        System.out.println(result);
    }

    public static List<String> addSuffixToDuplicates(List<String> list) {
        Map<String, Integer> countMap = new HashMap<>();
        List<String> uniqueList = new ArrayList<>();

        for (String item : list) {
            if (countMap.containsKey(item)) {
                int count = countMap.get(item);
                countMap.put(item, count + 1);
                uniqueList.add(item + count);  // Append count to duplicate
            } else {
                countMap.put(item, 1);
                uniqueList.add(item);  // First occurrence remains unchanged
            }
        }


        return uniqueList;
    }
}

