public class InlineMethod {
    // before refactor
    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }
    boolean moreThanFiveLateDeliveries() {
        int _numberOfLateDeliveries = 7;
        return _numberOfLateDeliveries > 5;
    }

    // after refactor
    int refactorGetRating() {
        int _numberOfLateDeliveries = 7;
        return (_numberOfLateDeliveries > 5) ? 2 : 1;
    }
}
