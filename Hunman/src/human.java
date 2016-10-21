/**
 * Created by alienware on 2016/10/19.
 */
public class human {

     String sex="大学长";

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void introduce(){
        System.out.println("我是"+name+",我的性别是"+sex+",我是永远年轻的"+age+"岁。");
    }
}
