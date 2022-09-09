public class DIYArrayList {
    // static means it belongs to the class. 
    // we want to intialize a default size and make it so others can not edit it. 
    static final int DEFAULT_SIZE = 1;

    //instance variables
    //int size; //this is the same as "nextOpen"
    private int nextOpen;
    //int maxSize;
    //int currentUsage;
    //be sure to make the actual array
    private String[] values;



    // need a constructor
    // this needs to be public
    public DIYArrayList() {
        // time to initialize these instance variables
        // WHY NOT INITIALIZE ABOVE?
        nextOpen = 0;
        values = new String[DEFAULT_SIZE];
    }

    public DIYArrayList(int initialSize) {
        nextOpen = 0;
        values = new String[initialSize];
    }


    // other methods
    public String get(int index) {
        return values[index];
    }

    public boolean contains(String lookFor) {
        for (int i =0; i < nextOpen; i++) {
            if (values[i].equals(lookFor)) {
                return true;
            }
        }
        return false ;
    }
}


// how does the times 2 work if you start with zero?