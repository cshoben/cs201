import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        // unique but must be in the same order entered. Best to use the !whatver.contains() and
        // then the add method. 

        List<String> keep = new ArrayList<>(list.length);
        String[] filtered = new String[list.length];

        for (int i = 0; i < list.length; i++) {
            if (!keep.contains(list[i])) {
                keep.add(list[i]);
            }
        }
        for (int i = 0;, i < keep.size(); i++) {
            filtered[i] = keep.get(i);
        }
        return filtered;
    }
}

