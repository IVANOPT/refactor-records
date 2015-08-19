class Gamma {

    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;

    Gamma (int inputVal, int quantity, int yearToDate) {
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    void compute () {
        importantValue1 = inputVal + quantity;   
        importantValue2 = inputVal * yearToDate;
        System.out.println("importantValue1 is "+String.valueOf(importantValue1));
        System.out.println("importantValue2 is "+String.valueOf(importantValue2));
    }

}
