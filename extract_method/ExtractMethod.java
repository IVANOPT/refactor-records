public class ExtractMethod {
    //before refactor
    void printOwing(double amount) {
        printBanner(); 
        // print details
        System.out.println("name is Ivan");
        System.out.println("amount is " + amount);
    }

    // after refactor
    void refactPrintOwing (double amount) { 
        printBanner(); 
        printDetails(amount);
    }

    void printDetails(double amount) {
        System.out.println("name is Ivan");
        System.out.println("amount is " + amount);
    }   

}
