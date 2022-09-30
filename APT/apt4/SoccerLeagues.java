import java.util.*;

public class SoccerLeagues {
    public int[] points(String[] matches) {
        // go through the array
        // for the 
        int[] scores = new int[matches.length]; 
        for (int i = 0; i < matches.length; i++) { // loop through all matches
            char[] chars = matches[i].toCharArray(); // turn match into characters
            for (int j = 0; j < chars.length; j++) { 
                
                if (chars[j] == 'D') {
                    scores[i] += 1;
                    scores[j] += 1;
                }
                if (chars[j] == 'W') {
                    scores[i] += 3;
                }
                if (chars[j] == 'L') {
                    scores[j] += 3;
                }
         
            }
        }
        return scores;
    }


/*
    public static void main(String[] args) {
        String[] matches = 
        
        {"-LWWLWDLDWWWWWWDDWDW",
 "D-WWLDDWDWDLWDDWLWDD",
 "LL-DLDWDLDLDWWWLWDDW",
 "LDD-LLLDLWLWWWWDWDWL",
 "LWWW-DWDLWDWDWWWDWDW",
 "DLLWD-WWLLDDDLWWDWWW",
 "WWLWDL-LLDWWWWWDWWLW",
 "LLLLLDW-LDLWDDLLLDWL",
 "DWWWWDDD-DWWWWDWWWDW",
 "WWWWLLLWL-LWWWWWLWWW",
 "DWWWWWWWLW-WDWWWWWWW",
 "DDDLLLDWWWL-DDWDWLDD",
 "LWLWLDLLLDLW-DDDWWDD",
 "LLWWLWDDLWLWL-WWWDLL",
 "WWWWLLDDDWLWDD-WWWLW",
 "DLDLLLWWLLLWWLW-DWLL",
 "DLWWWLDLWWDWWDWL-WWD",
 "LLDDLLWLLWLWLDLWW-WW",
 "LLWLLLWWLWLWWDWWLD-W",
 "LLWDLWDWDWLLWWDDWWL-"}
;
        SoccerLeagues testInstance = new SoccerLeagues();
        int[] testResult = testInstance.points(matches);
        for (int score : testResult) {
            System.out.println(score);
        }
        //System.out.println(testResult);   
    }
*/

}


