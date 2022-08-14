package test;

public class test_two {
    public static void start() {
        test_one mytry=new test_one();
    test_one.oneinstence duixiang2= mytry.getOneInstance();
    duixiang2.setVar1(7);
        System.out.println("gaihaole"+duixiang2.getVar1());
    }
}
