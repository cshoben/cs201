public class PairDown {
    public int[] fold(int[] list) {
        int sizeArray;
        if (list.length % 2 == 0) {
            sizeArray = list.length/2;
        } else {
            sizeArray = list.length/2 + 1;
        }

        int[] sums = new int[sizeArray];
        int tracker = 0;
        System.out.println(list.length + " is list length.");
        for (int i = 0; i < list.length; i += 2) {
            int add;
            System.out.println(i + " is current index.");
            if (i+1 < list.length) {
                System.out.println("hit true for i+1 being less than length");
                add = list[i] + list[i+1];
                System.out.println(add + " is current add value");
                sums[tracker] = add;
                System.out.println(tracker + " is current index adding to in sums array");

            } else {
                sums[tracker] = list[i];
            }
            tracker += 1;
        }
        
        
        return sums;

    }

/*
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        PairDown testInstance = new PairDown();
        int[] testResult = testInstance.fold(list);
        for (int i : testResult) {
            System.out.println(i);   
        }
        
    }
*/




}