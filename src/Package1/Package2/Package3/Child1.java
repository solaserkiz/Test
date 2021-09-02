package Package1.Package2.Package3;

public class Child1 {
    public int MethodFour() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int i = 0;
        int s=0;
        do {
            s=s+array[i];
            i++;
        } while (i< array.length);
        System.out.println(String.format("Array sumFourth = %d", s));
        return s;
    }
}
