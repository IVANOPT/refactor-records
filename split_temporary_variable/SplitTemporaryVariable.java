public class SplitTemporaryVariable {
    double height = 2;
    double width = 3;
    // before refactor
    void splitTemporaryV() {
        double temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }
    // after refactor
    void refactorSplitTemporaryV() {
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);
    }

}
