public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        int same = 0;
        while (a1 != null && a2 != null) {
            if (a1.info != a2.info) {
                same = 0;
                return same;
            }
            a1 = a1.next;
            a2 = a2.next;
        }
        if (a1 == null && a2 == null) {
            same = 1;
            return same;
        }

        return same;
    }


    // public static void main(String[] args) {
    //         int[] values1 = {};
    //         int[] values2 = {1, 2, 3, 4, 3, 2, 1};
    //         ListNode a1 = ListNodeUtil.listFromArray(values1);
    //         ListNode a2 = ListNodeUtil.listFromArray(values2);
    //         ListsEqual testInstance = new ListsEqual();
    //         int testResult = testInstance.equal(a1, a2);
    //         System.out.println(testResult + " is result.");   
    //     }



}
