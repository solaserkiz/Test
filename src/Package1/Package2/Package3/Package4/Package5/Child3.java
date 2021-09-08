package Package1.Package2.Package3.Package4.Package5;

public class Child3 {
    public int MethodFour() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int s = 0;
        for (int i : array) {
            s += i;
        }
        System.out.println("Array sumFourth =");
        return s;
    }
}
