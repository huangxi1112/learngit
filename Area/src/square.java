/**
 * Created by alienware on 2016/10/23.
 */
public class square extends shape{
    private double side ;
    public square(double side){
        this.side=side;
    }

    @Override
    public double getArea(){
    return(this.side*this.side);
}
}
