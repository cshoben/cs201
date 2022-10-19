import java.util.ArrayList;
import java.util.Arrays;

public class LunchPlans {
    public String[] favorites(String[] preferences) {
        String[] firstFriend = preferences[0].split("\\s");
        ArrayList<String> firFriList = new ArrayList<>();
        firFriList.addAll(((Arrays.asList(firstFriend))));
        ArrayList<String> allFriendsLike = new ArrayList<>();

        for (String food : firFriList) {
            int numberFriendsPrefer = 0;
            for (int i = 1; i < preferences.length; i++) {
                String[] nextFriend = preferences[i].split("\\s");
                for (String nextFood : nextFriend) {
                    //System.out.println(nextFood);
                    if (food.equals(nextFood)) {
                        System.out.println(food + " equals " + nextFood);
                        numberFriendsPrefer += 1;
                    }
                }
                
            }
            if (numberFriendsPrefer == (preferences.length-1)) {
                 allFriendsLike.add(food);
            } 
        }

    String[] returnArray = allFriendsLike.toArray(new String[0]);
    return returnArray;
}

    // public static void main(String[] args) {
    //         String[] n = {"pizza ramen sushi", "sushi ramen spaghetti", "ramen ice-cream sushi"};
    //         LunchPlans testInstance = new LunchPlans();
    //         String[] testResult = testInstance.favorites(n);
    //         for (String each : testResult) {
    //             System.out.println(each);   
    //         }
            
            
    //     }





}
