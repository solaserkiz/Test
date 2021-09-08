package Package1.Package2;

public class BaseClass {
    public int MethodOne() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int i = 0;
        int s = 0;
        while (i < array.length) {
            s = s + array[i];
            i++;
        }
        System.out.println("Array sumFirst =");
        return s;
    }
}


