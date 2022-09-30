import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {

        // Step 1: create a map for all available letters from headlines
        Map<Character, Integer> headlineMap = new HashMap<Character, Integer>();
        for (String headline : headlines) {                  // for each headline
            String[] splited = headline.split(" ");     // split headline into words
            for (String word : splited) {                     // for each word
                List<Character> chars = convertWordToCharList(word.toLowerCase());    // convert to list characters
                for (Character c : chars){                      // for each character
                    if (! headlineMap.containsKey(c)) {           // if it is not in the map
                        headlineMap.putIfAbsent(c, 0);    // add it to the map
                    }
                    headlineMap.put(c, (headlineMap.get(c) +1) );   // add 1 to the value for that character
                }
            }
          }

        // Step 2: make a map for each message, and check that we can write the message
        int numberMessages = 0;
        for (String message : messages) {
            Map<Character, Integer> messageMap = new HashMap<Character, Integer>();    
            String noSpace = message.replaceAll("\\s", "");         
            List<Character> chars = convertWordToCharList(noSpace.toLowerCase());       
            for (Character c : chars) {     // for each character
                    if (! messageMap.containsKey(c)) {           
                        messageMap.putIfAbsent(c, 0);    
                    }
                    messageMap.put(c, (messageMap.get(c) +1) );   
                }

        // Step 3: figure out which messages can be written with character counts 
            boolean canWrite = true;
            for (Map.Entry<Character,Integer> entry : messageMap.entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                if ((!headlineMap.containsKey(key)) || (headlineMap.get(key) < value)) {
                    canWrite = false;
                } 
            }
            if (canWrite) {
                numberMessages += 1;
            } 
        }
        return numberMessages;
    }
 
 // how many of the list of messages can be written?
    public static List<Character> convertWordToCharList (String word) {
        List<Character> chars = new ArrayList<>();
        for (char ch: word.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public static void main(String[] args) {
        String[] headlines = {"abcdef","abcdef"};
        String [] messages = {"AaBbCc","aabbbcc","   ","FADE"};
        Anonymous testInstance = new Anonymous();
        int testResult = testInstance.howMany(headlines, messages);
        System.out.println(testResult);   
    }


}

