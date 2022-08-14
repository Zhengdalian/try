package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test_one {
    static oneinstence duixiang1=new oneinstence();
    public static Integer getSometingById(String id){
        return Integer.valueOf(id);
    }
    public static List<Integer> getByIds(List<String> ids){
        List<Integer> res= new ArrayList<>(ids.size());
        System.out.println(res.size());
        ids.stream().forEach(id->{
            res.add(getSometingById(id));
        });
        return res;
    }
    public static  class oneinstence{
        int var1=1;
        public  void setVar1(int i){
            var1=i;
        }
        public int getVar1(){
            return var1;
        }
    }
    public static oneinstence getOneInstance(){
        return duixiang1;
    }

    public static void main(String[] args) {
        List<String> test=new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("3");
        System.out.println(getByIds(test));
        List<?> l2=test;
        l2.remove(1);
        System.out.println(l2);
        System.out.println(test);
        test_two.start();
        test_one.oneinstence duixiang=getOneInstance();
        System.out.println(duixiang.getVar1());
    }
}
