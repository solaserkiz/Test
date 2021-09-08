package Package1;

import Package1.Package2.BaseClass;
import Package1.Package2.Package3.Child1;
import Package1.Package2.Package3.Package4.Child2;
import Package1.Package2.Package3.Package4.Package5.Child3;

public class Project {
        public static void main(String[] args) {
        BaseClass base = new BaseClass();
        System.out.println(base.MethodOne());
        Child1 child1 = new Child1();
        System.out.println(child1.MethodTwo());
        Child2 child2 = new Child2();
        System.out.println(child2.MethodThree());
        Child3 child3 = new Child3();
        System.out.println(child3.MethodFour());
        }

    }

