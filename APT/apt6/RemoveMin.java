public class RemoveMin {
    public ListNode remove (ListNode list) {

        // I must determine the node with the lowest value. 
        // Then I must create a new linked List 
        // that skips that node. 

        // a for loop to determine the lowest value?
        ListNode first = list;
        int lowest = list.info;
        int numNodes = 0;
        while (list != null) {
            if (list.info < lowest) {
                lowest = list.info;
            } 
            list = list.next;
            numNodes += 1;
        }

        System.out.println("lowest " + lowest);
        list = first;

        // create an array that will hold the values to use in the new linked list. 
        int[] keepAsNodesArray = new int[numNodes -1];
        System.out.println("length of keepAsNodesArray: " + keepAsNodesArray.length);
        int positionTracker = 0;
        while (list != null) {
            if (list.info > lowest) {
                System.out.println("list.info " + list.info);
                keepAsNodesArray[positionTracker] = list.info;
                System.out.println("current positionTracker: " + positionTracker + " current keepAsNodesArrayValue stored here: " + keepAsNodesArray[positionTracker]);
                positionTracker++;
            }
            list = list.next;
        }

        // create the new linked list
        ListNode begin = null;
        ListNode current = null;
        for (int i = 0; i < keepAsNodesArray.length; i++) {
            System.out.println("current array value: " + keepAsNodesArray[i]);
            if (begin == null) {
                current = new ListNode(keepAsNodesArray[i]);
                begin = current;
            } else {
                current.next = new ListNode(keepAsNodesArray[i]);
                current = current.next;
            }
        

        }
        
        return begin;
    }

    // public static void main(String[] args) {
    //         int[] values = {5, 4, 3, 2, 1};
    //         ListNode list = ListNodeUtil.listFromArray(values);
    //         RemoveMin testInstance = new RemoveMin();
    //         ListNode testResult = testInstance.remove(list);
    //         ListNodeUtil.printList(testResult);  
    //     }


    
}
