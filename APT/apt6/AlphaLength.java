import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        
        // make array alphabetical and unique
        // turn to list in order to create a TreeSet which is automatically keep only unique and place alphabetical.
        // then turn TreeSet back to an array to make it easier to create the linked list. Useful because we want to make
        // the first node outside of the loop. 
        List<String> listFromArray = Arrays.asList(words);
        Set<String> wordSet = new TreeSet<String>(listFromArray);
        String[] uniqueWords = new String[wordSet.size()];
        uniqueWords = wordSet.toArray(uniqueWords);

        // make the first node with value based on length first word
        ListNode list = new ListNode(uniqueWords[0].length());
        ListNode first = list;

        // create the remainder of the node
        for (int i = 1; i < uniqueWords.length; i++) {
            int wordLength = uniqueWords[i].length();
            list.next = new ListNode(wordLength);
            list = list.next;
        } 
    return first;
    }


    // public static void main(String[] args) {
    //             String[] words = {"a", "a", "a", "a", "a", "a"};
    //             AlphaLength testInstance = new AlphaLength();
    //             ListNode testResult = testInstance.create(words);
    //             ListNodeUtil.printList(testResult);
    //         }
}
