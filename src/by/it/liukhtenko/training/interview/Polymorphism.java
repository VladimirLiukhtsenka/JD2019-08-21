package by.it.liukhtenko.training.interview;

import by.it.liukhtenko.training.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class Polymorphism {


    public static void main(String[]  args) {
        C c = new C();
        Polymorphism p = new Polymorphism();
//        test t;
//        t = () -> System.out.println("lambda!");




    }

    class A11 {
        void m() {
            System.out.println("AA m");

        }

        void m(int k) {
            System.out.println("AA m +" + k);
            ;
        }
    }

    class B11 extends A11 {

        protected void m() {
            System.out.println("B11 m");
        }

        int m(int f, int t) {
            return 1;
        }

    }

    interface test {
        void sum();

        static int dif(int a, int b) {
            return a - b;
        }

        default int mul(int a, int b) {
            return a * b;
        }
    }

    private static class C implements test {


        @Override
        public void sum() {

        }
    }
    private static class Z implements test {

        @Override
        public void sum() {

        }
    }
}
