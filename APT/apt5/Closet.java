
import java.util.*;


public class Closet {
    public String anywhere(String[] list) {
         // Start with an empty HashSet
         HashSet<String> uniqueWordsAny = new HashSet<>();

         // Look at each string in the input array, 
         // add break it into individual words
         // add these words to the hashSet with addAll method, this will only retain unique words
         for (String string : list) {
            String [] words = string.split("\\s+");
            uniqueWordsAny.addAll(Arrays.asList(words));
        }

        // Make an ArrayList so we can sort alphabetically. 
        // Use the Strings.join() method to put all words into one string. 
        ArrayList<String> wordsSorted = new ArrayList<>(uniqueWordsAny);
        Collections.sort(wordsSorted);

        String together = String.join(" ", wordsSorted);

        return together;
    }

        /*
    public static void main(String[] args) {
        String[] list = {"cow bell", "bell toll", "toll booth"};
        Closet testInstance = new Closet();
        String testResult = testInstance.anywhere(list);
        System.out.println(testResult);   
        
    }
        */

}
