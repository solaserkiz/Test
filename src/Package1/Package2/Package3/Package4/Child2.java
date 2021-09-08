package Package1.Package2.Package3.Package4;

public class Child2 {
    public int MethodThree() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int k = 0;
        for (int p = 0; p < array.length; p++) {
            k = k + array[p];
        }
        System.out.println("Array sumThird =");
        return k;
    }
}
