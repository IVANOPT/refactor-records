public class ReplaceTempWithQuery {

    //before refactor
    double quality = 1;
    double itemPrice = 2;
    double basePrice = quality * itemPrice;
    //before refactor end

    double basePriceCount() {
        if (basePrice > 1) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;    
        }
    } 

    //after refactor
    double refactorBasePriceCount() {
        double rQuality = 1;
        double mItemPrice = 2;
        return rQuality * mItemPrice; 
    }
    //after refactor end

}
