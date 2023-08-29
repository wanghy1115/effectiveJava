package pojo;

public class People {
    protected String name;
    protected int age;
    protected People(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static class Male extends People{
        int sex;
        protected Male(String name, int age) {
            super(name, age);
            sex = 1;
        }
        public String toString(){
            return String.format("name: %s, age: %d, sex:%s",name, age, sex == 1? "男":"女");
        }
    }
    public static People getPeople(String name, int age){
        return new People(name, age);
    }
    public static Male getMale(String name, int age){
        return new Male(name, age);
    }
    public String toString(){
        return String.format("name: %s, age: %d",name, age);
    }

}
