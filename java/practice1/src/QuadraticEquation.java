public class QuadraticEquation {
    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double x1, x2;
        //PUT YOUR CODE HERE
        double d =  Math.pow(b, 2) - (4.0d * a * c);
        if ((a != 0) && (b != 0)) {
            if (d > 0) {
                x1 = ((-1.0d) * b + Math.sqrt(d)) / (2.0d * a);
                x2 = ((-1.0d) * b - Math.sqrt(d)) / (2.0d * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else if (d == 0) {
                x1 = (- b) / (2.0d * a);
                x2 = x1;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else if (d < 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            }
        } else if ((a == 0) && (b != 0)) {
            x1 = 0.0d;
            x2 = x1;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else {
            System.out.println("x1=");
            System.out.println("x2=");
        }
        //PUT YOUR CODE HERE
    }
}
