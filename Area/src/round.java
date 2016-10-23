/**
 * Created by alienware on 2016/10/23.
 */
public class round extends shape{
    private double r;
    public round (double r){
        this.r=r;
    }

    @Override
    public double getArea() {
        double π=3.14;
        return Math.pow(r,2)*π;
    }
}
