import java.util.*;


public class BigWord {
    public String most(String[] sentences) {
        // turn all sentences into words?
     // will want to turn all the words into lower case at some point.
     // have a key that is updated every time we see the word. first populating the map 
     // with all unique values/words?
     // hashmap?
        ArrayList<String> allWords = new ArrayList<>();
        for (String sentence: sentences) {
            String[] words = sentence.split(" ");
            List<String> currentWords = Arrays.asList(words);
            allWords.addAll(currentWords);
        }
        
        Map<String, Integer> uniqueWords = new HashMap<String, Integer>();

        

        for (String word : allWords) {
            String lower = word.toLowerCase();
            if (!uniqueWords.containsKey(lower)) {
                uniqueWords.put(lower, 1);
            } else {
                uniqueWords.put(lower, (uniqueWords.get(lower) + 1));
            }
        }

        int maxValueMap = (Collections.max(uniqueWords.values()));

        for (Map.Entry<String, Integer> word : uniqueWords.entrySet() ){
            if (word.getValue().equals(maxValueMap)) {
                return word.getKey();
            }
        }
        return null;

    }

    ///* 
    public static void main(String[] args) {
    String[] sentences = {"THIS is the way", "THIS is the way", "this is this", "this is a story", 
    "THIS IS an exampe", "THIS is a fish", "THIS IS THE ONLY WAY TO FLY", 
    "this isn't right"};
    BigWord testInstance = new BigWord();
    //String testResult = testInstance.most(sentences);
    String testResult = testInstance.most(sentences);
    System.out.println(testResult);   
}
//*/
}
