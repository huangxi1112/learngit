/**
 * Created by alienware on 2016/11/1.
 */
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class Set {
    public static void main(String[] args) {
        List<String> A1 = new ArrayList<>();
        A1.add("I");
        A1.add("am");
        A1.add("a");
        A1.add("boy");
        A1.add("studying");
        A1.add("hard");
        Iterator iter=A1.iterator();
        for (int i = 0; i < A1.size(); i++) {
            System.out.print(A1.get(i)+" ");
        }
        for(Iterator iter1 = A1.iterator();iter1.hasNext();){
            String string=(String)iter1.next();
            System.out.print(string+" ");
        }
        while (iter.hasNext()){
            String string=(String)iter.next();
            System.out.print(string+" ");
        }
    }
}