package Package1;

import Package1.Package2.BaseClass;
import Package1.Package2.Package3.Child1;

public class Project {
        static void MethodOne() {
            int[] array = {10, 20, 30, 40, 50, 60};
            int k = 0;
            for (int p = 0; p < array.length; p++) {
                k = k + array[p];
            }
            System.out.println(String.format("Array sumFirst = %d", k));
        }
        static void MethodTwo() {
            int[] array = {10, 20, 30, 40, 50, 60};
            int s = 0;
            for (int i : array) {
                s += i;
            }
            System.out.println(String.format("Array sumSecond = %d", s));
        }

        public static void main(String[] args) {
        BaseClass base = new BaseClass();
        System.out.println(base.MethodThree());
        Child1 child1 = new Child1();
        System.out.println(child1.MethodFour());

            Project object = new Project();
            object.variables();
            byte y = 14;
            int t = 155;
            System.out.println(t);
            t = y;
            System.out.println(t);
            MethodOne();
            MethodTwo();
        }
        private void variables(){
            int i = 6;
            System.out.println(i);
            float f = -67.98f;
            System.out.println(f);
            byte b = -127;
            System.out.println(b);
            char ch = '#';
            System.out.println(ch);
            short s = -32456;
            System.out.println(s);
            long l = 152637;
            System.out.println(l);
            double d = 15.67;
            System.out.println(d);
            boolean bl = true;
            System.out.println(bl);
        }

    }

