public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // need to learn what a "long"type is
        // divide sizes by clustersize, if modulus is not zero, return 
        // int divsion plus one multipled by the clutersize. 
        // do this for all files, add up total disk space used. 

        long totalDiskSpace = 0;

        for (int fileSize : sizes) {
            int tempMultiplier = fileSize/clusterSize;
            int remainder = fileSize % clusterSize;
            int thisFile = clusterSize * (tempMultiplier + remainder);
            totalDiskSpace += thisFile;
        }
        return totalDiskSpace;
     }

      ///* 
      public static void main(String[] args) {
        int[] sizes = {600};
        int clusterSize = 512;
        TrueSpace testInstance = new TrueSpace();
        String[] testResult = testInstance.filter(list, minLength);
        for (String words: testResult) {
            System.out.println(words);
        }   
    }
    //*/
}
