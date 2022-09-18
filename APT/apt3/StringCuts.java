import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // unique but must be in the same order entered. Best to use the !whatver.contains() and
        // then the add method. 

        List<String> keep = new ArrayList<>(list.length);

        for (int i = 0; i < list.length; i++) {
            if (list[i].length() >= minLength) {
                if (!keep.contains(list[i])) {
                    keep.add(list[i]);
                }
            }
        }
        String[] filtered = new String[keep.size()];
        for (int i = 0; i < keep.size(); i++) {
            filtered[i] = keep.get(i);
        }
        return filtered;
    }


    /* 
      public static void main(String[] args) {
        String[] list = {"boisterous"};
        int minLength = 10;
        StringCuts testInstance = new StringCuts();
        String[] testResult = testInstance.filter(list, minLength);
        for (String words: testResult) {
            System.out.println(words);
        }
        
    }

    */

}

