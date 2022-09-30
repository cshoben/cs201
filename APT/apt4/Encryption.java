import java.util.*;

public class Encryption {
    public String encrypt(String message){

        Map<Character, Character> encryptionMap = new HashMap<Character, Character>();
        List<Character> chars = convertWordToCharList(message);    // convert to list characters
        int alphabetPosition = 0;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // Build the encryption map
        for (Character c: chars) {
            if (! encryptionMap.containsKey(c)) {           // if it is not in the map
                Character nextChar = Character.valueOf(alphabet[alphabetPosition]);
                encryptionMap.putIfAbsent(c, nextChar);    // add it to the map
                alphabetPosition += 1;
            }
        }
        // Encrypt the message
        String encryption = "";
        for (Character c : chars) {
            encryption += encryptionMap.get(c);
        }

        return encryption;
    }

    public List<Character> convertWordToCharList (String word) {
        List<Character> chars = new ArrayList<>();
        for (char ch: word.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }


/*
    public static void main(String[] args) {
        String message = "encryption";
        Encryption testInstance = new Encryption();
        String testResult = testInstance.encrypt(message);
        System.out.println(testResult);   
    }
*/

}
