package pojo;

/**
 * 使用静态工厂代替构造方法
 */
public class Persion {
    private String name;
    private int age;
    private int sex;

    //将构造方法设置为私有，防止外部调用。
    private Persion(String name, int age, int sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //创建一个人对象
     public static Persion getPersion(String name, int age, int sex){
        return new Persion(name, age, sex);
     }
    //创建一个成年人对象
    public static Persion getAdultPersion(String name, int age, int sex){
        if(age < 18){
            return new Persion("", 0, 0);
        }
        return new Persion(name, age, sex);
    }

     public String toString(){
        return String.format("name:%s, age:%d, sex:%s", name, age, sex == 0? "男":"女");
     }
}
