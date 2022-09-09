//package APT;

public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
        // determine if each point (x1,y1 and x2,y2) are inside the circle
        // interate over each circle
        // if both point inside circle or outside circle, do nothing. otherwise, ++1 to a variable. 
        // this variable we are adding to will be the least number of borders and value to return. 
        int bordersCrossed = 0;
        boolean startInside = false; 
        boolean endInside = false;
        boolean isEqual;

        for (int i = 0; i < x.length; i++) {
            startInside = insideCircleCheck(x1, y1, x[i], y[i], r[i]);
            //System.out.println("i = " + i + " startInside is " + startInside);
            endInside = insideCircleCheck(x2, y2, x[i], y[i], r[i]);
            //System.out.println("i = " + i + " endInside is " + endInside);
            isEqual = (startInside == endInside);
            //System.out.println("i = " + i + " isEqual is " + isEqual);
            if (!isEqual) {
                bordersCrossed += 1;
            }
        }
        return bordersCrossed;
    }

    public boolean insideCircleCheck(int x, int y, int cx, int cy, int r) {
        double dist = (x-cx) * (x-cx) + (y-cy) * (y-cy);
        double radSquared = r*r;
        return dist < radSquared;
    }

    /*
    public static void main(String[] args) {
        int[] x = new int[]{-107,-38,140,148,-198,172,-179,148,176,153,-56,-187};
        int[] y = new int[]{175,-115,23,-2,-49,-151,-52,42,0,68,109,-174}; 
        int[] r = new int[]{135,42,70,39,89,39,43,150,10,120,16,8};
        int x1 =  102;
        int y1 = 16;
        int x2 =  19;
        int y2 = -108;
        int bordersCrossed = apt1CirclesCountry.leastBorders(x, y, r, x1, y1, x2, y2);
        System.out.println(x1 + " " + x2);
        System.out.println(bordersCrossed);
    }
    */
}
