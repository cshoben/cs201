import java.util.*;

public class Translate {
    public int numAlternates(String original, String translated) {
        int numTrans = 0;
        HashMap<String, HashSet<String>> wordMap = new HashMap<String, HashSet<String>>();

        String[] oriWords = original.split("\\s+");
        String[] traWords = translated.split("\\s+");

        for (int i=0; i < oriWords.length; i++) {
            // if the map doesnt already have this item, add it in
            if (! wordMap.containsKey(oriWords[i])) {
                HashSet<String> set = new HashSet<String>();
                wordMap.put(oriWords[i], set);
                set.add(traWords[i]); 
            } else {
                HashSet<String> set = wordMap.get(oriWords[i]);
                set.add(traWords[i]);
            }
        }
        for (String each : wordMap.keySet()) {
            int size = wordMap.get(each).size();
            if (size > 1) {
                numTrans += size;
            }
        }
        System.out.println(wordMap);    
        return numTrans;
    }


  public static void main(String[] args) {
            String original = "ta ta ta ba ba ka";
            String translated = "foo bar zip foo bar foo";
            Translate testInstance = new Translate();
            int testResult = testInstance.numAlternates(original, translated);
            System.out.println(testResult);   
        }




}
