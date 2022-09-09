//package APT;

public class Totality {
    public int sum(int[] a, String stype) {
        int total = 0;
        int i = 0;
        switch (stype) {
            case "odd":
                while (i < a.length) {
                    if (i % 2 == 1) { // if index is odd
                        total += a[i];
                    }
                    i++;
                }   
            
            case "even":
                while (i < a.length) {
                    if (i % 2 == 0) { // if index is even
                        total += a[i];
                    }
                    i++;
                }   

            case "all":
                while (i < a.length) {
                    total += a[i];
                    i++;
                 }   
        }
        return total;
    }

/* 
    public static void main(String[] args) {
        int[] a = new int[]{22,23};
        String stype = "even";

        int sum = Totality.sum(a, stype);
        System.out.println(sum);
    }
*/
}
