import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
             // TODO: fill in code here
             // entrace log files
             // three clubs
             // return sorted list of all people not honest
                // meaning that person went to more than one club on a given day
            
            // I could make a list of all the members that went that day
            // I could then check each club and count the number they appear in
            // if count is greater than two, report their name
            // figure out how to report back in lexiographic order. 

            //Map<String, Integer> members = new HashMap<String, Integer>();
            List<String> dishonestTracker = new ArrayList<>();
            List<String> club2List = Arrays.asList(club2);
            List<String> club3List = Arrays.asList(club3);

            for (String person : club1) {
                if (!dishonestTracker.contains(person)){
                    if (club2List.contains(person) || club3List.contains(person)) {
                        dishonestTracker.add(person);
                    }
                }
            }
            for (String person : club2) {
                if (club3List.contains(person) && !dishonestTracker.contains(person) ) {
                    dishonestTracker.add(person);
                }
            }
            Collections.sort(dishonestTracker);
            String[] dishonest = new String[dishonestTracker.size()];
            dishonest = dishonestTracker.toArray(dishonest);
            return dishonest;
      }

/*
    public static void main(String[] args) {
        String[] club1 = {"JAMES","HUGH","HUGH","GEORGE","ELIZABETH","ELIZABETH","HUGH",
        "DAVID","ROBERT","DAVID","BOB","BOBBY","PAM","JAMES","JAMES"}    ;
        String[] club2 = {"BOBBY","ROBERT","GEORGE","JAMES","PEG","JAMES","DAVID","JOHN","LIZ",
        "SANDRA","GEORGE","JOHN","GEORGE","ELIZABETH","LIZ","JAMES"}   ;
        String[] club3 = {"ROBERT","ROBERT","ROBERT","SANDRA","PAM","BOB","LIZ","GEORGE"}    ;
        MemberCheck testInstance = new MemberCheck();
        for (String person : testInstance.whosDishonest(club1, club2, club3)) {
            System.out.println(person);
        }
        //String[] testResult = testInstance.whosDishonest(club1, club2, club3);
        //System.out.println(testResult);   
    }
*/




}
