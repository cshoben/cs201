import java.util.*;

public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        // want to go through each element of the list and if larger than the last element add it to something
        // will return an array which can not grow. Use a different type and then convert. 

        ArrayList<Integer> increasingList = new ArrayList<>();
        int lastNumber = numbers[0];
        increasingList.add(lastNumber);

        for (int i = 1; i < numbers.length; i++) {
            if (lastNumber < numbers[i]) {
                increasingList.add(numbers[i]);
                lastNumber = numbers[i];
                }
            }

        int[] finalArray = new int[increasingList.size()];
        for (int i = 0; i < increasingList.size(); i++) {
            finalArray[i] = increasingList.get(i);
        }
        return finalArray;
        }

        

    // public static void main(String[] args) {
    //     int[] n = {2, 2, 5, 1, 3, 4, 6};
    //     Increasing testInstance = new Increasing();
    //     int[] testResult = testInstance.getIncreasing(n);
    //     for (int each : testResult) {
    //         System.out.println(each);   
    //     }
        
        
    // }
}