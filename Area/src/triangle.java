/**
 * Created by alienware on 2016/10/23.
 */
public class triangle extends shape {
    private double a ;
    private double b ;
    private double c ;
    public triangle(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
        public double getArea(){
            double p = (a + b + c) / 2;
            return Math.pow(p*(p-this.a)*(p-this.b)*(p-this.c),0.5);
    }

}
