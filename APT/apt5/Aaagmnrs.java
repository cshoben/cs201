import java.util.*;

public class Aaagmnrs {
    private String mySorted;
    private String myString;

    public void setAnagram(String s) {
        myString = s;
        char[] a = s.toCharArray();
        Arrays.sort(a);
        mySorted = new String(a);
    }
    @Override
    public String toString() {
        return myString;
    }
    @Override
    public int hashCode () {
        return mySorted.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) {
            return false;
        } 
        Aaagmnrs ana = (Aaagmnrs) o;
        return mySorted.equals(ana.mySorted);
    }

    public String[] anagrams(String[] phrases) {

        // Used the AnaWord code from Discussion 5 to help design the class object. 
        
        // Create an ArrayList with all the input phrases. 
        List<String> keep = new ArrayList<String>();
        keep.addAll(Arrays.asList(phrases));

        // Loop through each phrase, and turn it into an Anagram object which will allow us to 
        // compare the phrases for being Aaagmnrs. 
    
        for (int i = 0; i < phrases.length; i++) {
            String clean = phrases[i].replaceAll("\\s", "");
            Aaagmnrs current = new Aaagmnrs();
            current.setAnagram(clean.toLowerCase());
            //System.out.println("entered i= " + i + " loop. Clean word is: " + clean);

            // Loop through all the phrases ahead of the phrase in the loop above. 
            // Turn these into Aaagmnrs objects as well. 
            for (int j = 1; j < (phrases.length - i); j++) {
                //System.out.println("entered j= " + j + " loop");
                String cleanNext = phrases[i+j].replaceAll("\\s", "");
                //System.out.println("Cleannext word is: " + cleanNext);
                Aaagmnrs next = new Aaagmnrs();
                next.setAnagram(cleanNext.toLowerCase());

                // Compare these two Anagram objects for equality. If they are equal, remove that phrase from the list created
                // at the beginning of this method. 
                //System.out.println("compare " + current.mySorted + " to " + next.mySorted + " for equality");
                if (current.equals(next)) {
                    keep.remove(phrases[i+j]);
                }
            }
          
        }

       // Turn the ArrayList back into an Array to be output for the method. 
        String[] arr = new String[keep.size()];
        for (int i = 0; i < keep.size(); i++) {
            arr[i] = keep.get(i);
        }
        
        return arr;
    }


    // public static void main(String[] args) {
    //     String[] list = { "Radar ghost jilts Kim", "patched hers first",
    //     "DEPTH FIRST SEARCH", "DIJKSTRAS ALGORITHM"  };
    //     Aaagmnrs testInstance = new Aaagmnrs();
    //     System.out.println(" ");
    //     String[] testResult = testInstance.Aaagmnrs(list);
    //     for (String s : testResult) {
    //         System.out.println(s);  
    //     }
         
        
    // }
 }
