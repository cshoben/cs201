public class ListNodeUtil {
    // create a linked list based on input int array
    public static ListNode listFromArray(int[] values) {
        if (values.length <= 0) {
            return null;
        }
        ListNode list = new ListNode(values[0]);
        ListNode current = list;
        for (int i = 1; i < values.length; i++) {
                current.next = new ListNode(values[i]);
                current = current.next;
            }
        return list;
    }



    public static void printList (ListNode list) {

    }
}



// 2. // fill in

// for (int i = 1; i < values.length(); i++) {
//     current.next = new ListNode(values[i]);
//     current - current.next;
// }


// 5. printing method 
// TODO1 (list.next != null)
// TODO2 list = list.next
    

// public class SortedListRemoval {

//     public ListNode uniqify(ListNode list){
//         if (list ==null) return list;
//         ListNode first = list; 
//         ListNode current = first.next;
 
//         while(current != null){
 
//             if (current.info == list.info){
 
//                 list.next = current.next;
 
//             } else {
//                 list = list.next;
//             }
 
//             current = current.next;
 
//         }
 
//         return first;
 
//     }

// }





//MergeList 

// public class MergeLists {

//     public ListNode weave(ListNode a, ListNode b) {
 
//         ListNode first = a;  
 
//         while (a != null) {
 
//             ListNode temp = a.next;
 
//             a.next = b;
     //           b = b.next;
 
//             a = a.next;
 
//             a.next = temp;
 
//             a = a.next;
 
 
//         }
 
//         return first;
 
//    }