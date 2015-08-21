public class SelfEncapsulateField {
    // before refactor
    private int low, high;

    boolean includes (int arg) {
        return arg >= low && arg <= high; 
    }   

    // after refactor
    int getLow() {
        return low; 
    }

    int getHigh() {
        return high;
    }

    boolean refactorIncludes(int arg) {
        return arg >= getLow() && arg <= getHigh(); 
    }

}
