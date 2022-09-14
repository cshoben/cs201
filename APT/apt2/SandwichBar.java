import java.util.*;


public class SandwichBar {
        public int whichOrder(String[] available, String[] orders){
           // fill in code here
           // make available into a set...
           ArrayList <String> availList = new ArrayList<>();
           availList.addAll((Arrays.asList(available)));
         
            for (int i = 0; i < orders.length; i++) {
                String[] orderSplit = orders[i].split(" ");
                if (availList.containsAll(Arrays.asList(orderSplit))) {
                    return i;
                }
            }
           return -1; 
        }

/* 
        public static void main(String[] args) {
            String[] available = { "foo", "bar", "baz", "gazonk", "quux", "bat", "xyzzy",
            "shme", "hukarz", "grault", "waldo", "bleh" };
            String[] orders = { "kalatehas", "spam eggs", "needle haystack", "bleh blarg", "plugh", 
            "the best sandwich in the universe" };
            SandwichBar testInstance = new SandwichBar();
            int testResult = testInstance.whichOrder(available, orders);
            System.out.println(testResult);
        }
     }

     */
  
// available is the list of ingredients thae snadwich bar can use. 
// orders are the types of sandwiches. 
// return index of sandwich to buy (fist that works!)

// .containsAll()?

// look at first element of orders, then check each ingredient in the available 
// can use the .split(" ") for the orders section. 