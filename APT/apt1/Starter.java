import java.util.*;

public class Starter {
    public int begins (String[] words, String first) {
        int numWords = 0;
        char firstChar;
        String word;
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (int i =0; i < words.length; i++) {
            word = words[i];            
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        for (int i =0; i < uniqueWords.size(); i++) {
            //String[] arrUniqueW = new String[uniqueWords.toArray()];
            firstChar = uniqueWords.get(i).charAt(0);
            if (first.equals(Character.toString(firstChar))){
                numWords += 1;
            }
        } 
    
        return numWords;
    }
/*
    public static void main(String[] args) {
        String[] words = {"one", "two", "one", "two"};
        String first = "p"; 
        int begins = Starter.begins(words, first);
        
        System.out.println(begins);
    }

*/
}
