import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要选择的图形，0是正方形，1是三角形，其他为圆：");
        int o =input.nextInt();
        if(o==0){
            System.out.println("请输入正方形的边长：");
            double i =input.nextDouble();
            shape A = new square(i);
            System.out.println("所求图形面积是："+A.getArea());
        }
        else if(o==1){
            System.out.println("请输入三角形的三边");
            System.out.println("边长a：");
            double a =input.nextDouble();
            System.out.println("边长b：");
            double b =input.nextDouble();
            System.out.println("边长c：");
            double c =input.nextDouble();
            shape A = new triangle(a,b,c);
            System.out.println("所求图形面积是："+A.getArea());
        }
        else {
            System.out.println("请输入圆的半径：");
            double r =input.nextDouble();
            shape A =new round(r);
            System.out.println("所求图形面积是："+A.getArea());
        }

    }
}
