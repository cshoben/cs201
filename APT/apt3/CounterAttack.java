import java.util.*;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        
        String[] eachWord = str.split(" ");
        int[] counts = new int[words.length];
        int current;

        for (int i = 0; i < words.length; i++) {
            current = 0;
            for (String word : eachWord) {
                if (words[i].equals(word)) {
                    current += 1;
                }
            }
            counts[i] = current;
        }


        return counts;
    }

/* 
public static void main(String[] args) {
    String str ="one two one two one two vorpal blade";
    String[] words = {"snicker", "one", "blade", "runner"}    ;
    CounterAttack testInstance = new CounterAttack();
    int[] testResult = testInstance.analyze(str, words);
    System.out.println(Arrays.toString(testResult));   
}
*/



}
