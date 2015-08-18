public class RemoveAssignmentsToParameters {
    //before refactor
    int removeAssignmentsToParameters(int inputVal, int quantity) {
        if (inputVal > 50) inputVal -= 2;   
        if (quantity > 50) inputVal -= 1;
        return inputVal;
    }

    //after refactor
    int refactorRemoveAssignmentToParameters(final int inputVal, final int quantity) {
        int result = inputVal;
        if (inputVal > 50) result -= 2;   
        if (quantity > 50) result -= 1;
        return result;
    }
    
}
