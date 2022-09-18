import java.util.*;


public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
          // check each work in dictionary, 
          //if contains, add the words.length() * word.length() to the score

          int score = 0;

          // convert the array into something with only unique values so 
          // all duplicates are removed and then loop. 
          //ArrayList <String> playerList = new ArrayList<>();
          //playerList.addAll((Arrays.asList(player)));
          Set <String> playerSet = new HashSet<>();
          for (String w : player) {
            playerSet.add(w);
          }

          for (String word : playerSet) {
            if (Arrays.asList(dictionary).contains(word)) {
                score += (word.length() * word.length());
            }
          }
          return score;
      }

/* 
      public static void main(String[] args) {
        String[] player = { "lidi", "o", "lidi", "gnbewjzb", "kten",
        "ebnelff", "gptsvqx", "rkauxq", "rkauxq", "kfkcdn"};
        String[] dictionary = { "nava", "wk", "kfkcdn", "lidi", "gptsvqx",
        "ebnelff", "hgsppdezet", "ulf", "rkauxq", "wcicx"};
        SimpleWordGame testInstance = new SimpleWordGame();
        int testResult = testInstance.points(player, dictionary);
        System.out.println(testResult);
    }

    */



}


// player is all the words remembered
// dictionary, all the possible words remembered. 
// want to score the total number of unique words remembered
// by the player. 
// score for each word is the square of the word's length. 