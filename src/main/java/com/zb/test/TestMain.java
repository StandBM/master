package com.zb.test;

import com.zb.entity.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMain {
//    public static void main(String args[]){
//        List<Student> list = Arrays.asList(
//                new Student("李四","1","1"),
//                new Student("张三","1","2"),
//                new Student("王五","1","3")
//                //zhangsan lisi wangwu
//        );
//        Collections.sort(list,(x,y) -> {
//            if(Integer.parseInt(x.getId()) != Integer.parseInt(y.getId())){
//                return Integer.compare(Integer.parseInt(x.getId()),Integer.parseInt(y.getId()));
//            }else{
//                return x.getStuName().compareTo(y.getStuName());
//            }
//        });
//        for (Student stu: list) {
//            System.out.println(stu.getStuName());
//        }
//    }

    public static void main(String args[]){
//        String str = new TestMain().getValue("hello Word",x -> x.toUpperCase());
//        System.out.println(str);
        Long r = new TestMain().getR(25l,30l, (t1,t2) -> t1 * t2);
        System.out.println(r);
        Integer r1 = new TestMain().getR(1,2,(t1, t2) -> t1 + t2);
        System.out.println(r1);
        //sLong r2 = getR(25l, 23l, (t1, t2) -> t1 + t2);
    }
    public String getValue(String str,TestMainInterface my){
        return my.getvalue(str);
    }

    public <T,R> R getR(T t1, T t2,MyFunction2<T,R> myFunction2){
        return myFunction2.method(t1,t2);
    }

    public interface MyFunction2<T,R>{
        public R method(T t1,T t2);
    }
}
