
   public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
            // fill in code here
            String max = "";
            int count;
            int maxCount = 0;
            // add a check to ensure the nuc String is only a max length of 1. 
            char baseOfInterest = nuc.charAt(0);

            // psuedocode: I want to count the number
            // of times a character occurs in a string. 
            //if a tie, longest string wins. 
            // I will go through the list of strings
            // for each string, break into characters. 
            // check each character if it is a 

            for (String strand : strands) { // range through the strands array
                count = 0;
                char[] nucleotides = strand.toCharArray(); //turn the current strand string into a char array
                for (char base : nucleotides) { //range over the chars
                    if (base == baseOfInterest) { //check if the char is the same as the String nuc input 
                        count++;
                    }
                if (count > maxCount) { //if the numer of times the base of interst occurs is greater than the last one checked. 
                    max = strand; // the max strand is the current strand. 
                    maxCount = count;
                } else if (maxCount > 0 && count == maxCount) { // if the values are equal. 
                    if (max.length() < strand.length()) { // only update the max strand if the current strand if longer. 
                        max = strand;
                    }
                    /*if (max.length() == strand.length()) { 
                        throw new java.lang.Error("cant resolve, strands same length");
                    } */
                }
                
                }
            }
            return max;
        }

        /* 
      public static void main(String[] args) {
        String[] strands = {"g", "gg", "ggg", "gggg"};
        String nuc = "c";
        DNAMaxNucleotide testInstance = new DNAMaxNucleotide();
        String testResult = testInstance.max(strands, nuc);
        System.out.println(testResult);
      }
      */
   }

