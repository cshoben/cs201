public class ListSum {
    public int sum(ListNode list, int thresh) {
        int sum = 0;

        // will want to go through the list and add the list info value 
        // to the sum every time is above the thresh input. 
        while (list != null) {
            if (list.info > thresh) {
                sum += list.info;
            }
            list = list.next;
        }


        return sum;
    }

    // public static void main(String[] args) {
    //     int[] values = {1,2,3,4,5,6,7,8,9,10};
    //     ListNode list = ListNodeUtil.listFromArray(values);
    //     ListSum testInstance = new ListSum();
    //     int testResult = testInstance.sum(list, -22);
    //     System.out.println(testResult);   
    // }
}