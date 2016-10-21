import java.util.concurrent.Callable;

/**
 * Created by alienware on 2016/10/19.
 */
public class ren {

    public static void main(String args[]) {
        human D = new human();
        D.setAge(18);
        D.setName("徐书展");
        D.introduce();

        human B = new human();
        B.setAge(18);
        B.setName("曾名杨");
        B.introduce();

        human A = new human();
        A.setAge(18);
        A.setName("吴随");
        A.introduce();


        human C = new human();
        C.setAge(18);
        C.setName("郑YX");
        C.introduce();


        human E = new human();
        E.setAge(18);
        E.setName("曹越");
        E.introduce();

        human F = new human();
        F.setAge(18);
        F.setName("49");
        F.introduce();
    }
}
