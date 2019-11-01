package com.example.royal;

/**
 * @author by yze on 2019/10/31
 * @see
 * @since
 */
public class Test {

    public void sayHello(){
        System.out.println("Hello, this is AspectJ");
    }

    public static void main(String args[]){
        System.out.println("Transaction begin");
        Test test = new Test();
        test.sayHello();
        System.out.println("Transaction end");
    }


}
