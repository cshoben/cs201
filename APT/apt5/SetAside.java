import java.util.*;


public class SetAside {
    public String common(String[] list) {

        // Start with a map of all the words in the first string. 
        String[] startingWords = list[0].split("\\s+");
        HashSet<String> uniqueWordsCommon = new HashSet<>();
        uniqueWordsCommon.addAll(Arrays.asList(startingWords));

        // Then look at the elemets of the input string[], yes this is 
        //repeating the first one but whatever for now.
        // This each string will be split on the words and then HashSet .retainAll() will keep
        // the intersect of the map and the input arrayList. 
        for (String string : list) {
            //char [] word = word.toCharArray();
            String [] words = string.split("\\s+");
            uniqueWordsCommon.retainAll(Arrays.asList(words));

        }
 
        // In order to ouput alphabetically, we will turn HashSet to ArrayList and use the .sort() 
        // method. The .join() methos will then be used to make one long string to be use as the output
        // of this method. 
        ArrayList<String> wordsSorted = new ArrayList<>(uniqueWordsCommon);
        Collections.sort(wordsSorted);

        String together = String.join(" ", wordsSorted);

        return together;
        
    }





        /*
    public static void main(String[] args) {
        String[] list = {"blue blue water", "blue skies are blue", "blue is blue"};
        SetAside testInstance = new SetAside();
        String testResult = testInstance.common(list);
        System.out.println(testResult);   
        
    }
        */
}
