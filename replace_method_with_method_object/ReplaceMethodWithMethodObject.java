public class ReplaceMethodWithMethodObject {

    // before refactor
    void gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = inputVal * quantity;   
        int importantValue2 = inputVal * yearToDate;
        // do sth.
    }

    // after refactor
    void refactorGamma(int inputVal, int quantity, int yearToDate) {
        new Gamma(inputVal, quantity, yearToDate);
    }

}
