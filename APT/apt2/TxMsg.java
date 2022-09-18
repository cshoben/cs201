import java.util.*;;

public class TxMsg {
    public String getMessage(String original) {
        // split up the words
        String[] words = original.split(" ");
        // initialize the final text. it will be same number of "words"
        String[] txt = new String[words.length];

        // loop through each word, converting it based on rules. 
        for (int i=0; i < words.length; i++) {
            txt[i] = convert(words[i]);
        }
        // return a new string containing the edited text
        return String.join(" ", txt);
      }



    public String convert(String word) {
        // break up the word into characters
        char[] letters = word.toCharArray();

        // build up the vowel ArrayList
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        List<Character> vowelsList = new ArrayList<>();
        for (Character let : vowels) {
            vowelsList.add(let);
        }

        // ArrayList to keep the char as we test each one
        ArrayList<Character> keepChar = new ArrayList<>();
        
        for (int j = 0; j < letters.length; j++){
            // if it is a vowel, go to text char
            if (vowelsList.contains(Character.valueOf(letters[j]))) {
                continue;
            } else {
                // if its the first letter and not a vowel, add it and go to next
                if (j == 0) {
                    keepChar.add(letters[j]);
                    continue;
                }
                // if the letter before was a vowel (and this one is not a vowel and not first letter), add it
                if (vowelsList.contains(Character.valueOf(letters[j-1]))) {
                    keepChar.add(letters[j]);
                }
            }
        }
    
        if (!keepChar.isEmpty()) {
                StringBuilder newTxt = new StringBuilder(keepChar.size());
                for (Character c : keepChar) {
                    newTxt.append(c);
                }
                //String newTxt = String.valueOf(keepChar);
                return newTxt.toString();
        }
        return word;
    }
    
        //convertedTxt = String.valueOf(keepChar);
        //return convertedTxt;
        
/* 
    public static void main(String[] args) {
        String original = "aeiou bcdfghjklmnpqrstvwxyz";
        TxMsg testInstance = new TxMsg();
        String testResult = testInstance.getMessage(original);
        System.out.println(testResult);
    }
*/

}
// string is a string. we will evaluate/change each word. maintain the spacing. 
// rules:
// 1. if only vowels, return the original word 
// 2. if at least one consonant, write consonants without another consonant before them. no vowels
// 


// pseudocode:
// cut string into words. 
// for each word, evaluate the chars
// if the char is a vowel, move next letter, if all vowels, add the original word to a new
// string[] as it. 
// if a consonant, add