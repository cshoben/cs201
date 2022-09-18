public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // divide sizes by clustersize, if modulus is not zero, return 
        // int divsion plus one multipled by the clutersize. 
        // do this for all files, add up total disk space used. 

        long totalDiskSpace = 0;
        int thisFile;

        for (int fileSize : sizes) {
            int tempMultiplier = fileSize/clusterSize;
            thisFile = 0;
            //int remainder = fileSize % clusterSize;
            if (fileSize % clusterSize == 0){
                thisFile = clusterSize * tempMultiplier;
            } else {
                thisFile = clusterSize * (tempMultiplier + 1);
            }
            //int thisFile = clusterSize * tempMultiplier + (tempMultiplier + remainder);
            totalDiskSpace += thisFile;
        }
        return totalDiskSpace;
     }

      ///* 
      public static void main(String[] args) {
        int[] sizes = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int clusterSize = 8;
        TrueSpace testInstance = new TrueSpace();
        long testResult = testInstance.calculateSpace(sizes, clusterSize);
        System.out.println(testResult);   
    }
    //*/
}
