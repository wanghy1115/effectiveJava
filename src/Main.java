import pojo.FixTool;
import pojo.People;
import pojo.Persion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        phone huawei = PhoneFactory.getPhone("huawei");
        huawei.call();
    }
    interface phone{
        void call();
    }
    static class Huawei implements phone{
        @Override
        public void call(){
            System.out.println(String.format("用华为打电话"));
        }
    }
    static class Xiaomi implements phone{
        @Override
        public void call(){
            System.out.println(String.format("用小米打电话"));
        }
    }
    static class PhoneFactory{
        public static phone getPhone(String s){
            if("huawei".equals(s)){
                return new Huawei();
            }else if("xiaomi".equals(s)){
                return new Xiaomi();
            }
            return null;
        }
    }
}