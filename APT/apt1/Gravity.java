public class Gravity {
    public double falling (double time, double velo) {
        double meters = 0;
        double acceleration = 9.8;

        meters = (velo * time) + (0.5 * acceleration * (time * time));
        return meters;
    }

    /*
public static void main(String[] args) {
    double time = 86400;
    double velo = 0;

   double output = Gravity.falling(time, velo);
    System.out.println(output);
}
*/
}