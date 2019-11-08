import java.util.Scanner;

public class QuadraticEquation {

    private double a, b, c;

    double x1, x2;
    double delta;

    Scanner input = new Scanner(System.in);


    public QuadraticEquation() {

    }


    public QuadraticEquation(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double tinhDelta() {
        double delta = ((Math.pow(b, 2)) - 4 * a * c);
        return delta;
    }


    public double getRoot1() {
        x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        System.out.println("x1= " + x1);

        return x1;

    }

    public double getRoot2() {
        x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.println("x2= " + x2);
        return x2;
    }

    public double nghiemkep() {
        x1 = -b / (2 * a);
        return x1;
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a");
        this.a = input.nextDouble();

        System.out.println("Nhap b");
        this.b = input.nextDouble();

        System.out.println("Nhap c");
        this.c = input.nextDouble();

    }

    public void checkDk() {
        double delta = tinhDelta();
        System.out.println("delta"+delta);
        if (delta > 0) {
            System.out.println("Co 2 nghiem " + getRoot1() + getRoot2());

        } else if(delta == 0){
            System.out.println("PT co 1 nghiem kep: " + nghiemkep());
        } else{
            System.out.println("PT vo nghiem");
        }
    }


    public static void main(String[] args) {
        QuadraticEquation ptb2 = new QuadraticEquation();
        ptb2.nhap();
        ptb2.checkDk();

    }

}
