import java.math.BigInteger;import java.util.Scanner;
public class shu {
    public  static void result ( int f,int i,int j){
    BigInteger A = new BigInteger("1");
        for ( int e=f;e > 0; e--) {
            A = A.multiply(new BigInteger(String.valueOf(e)));
        }
        System.out.println(A);
        System.out.println(A.toString().substring(i,j));
}

public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("请输入阶乘数:");
        int f =input.nextInt();
        System.out.print("请输入截取开始位置：");
        int i = input.nextInt();
        System.out.print("请输入截取结束位置:");
        int j =input.nextInt();
    shu.result(f,i,j);
        }}
