public class InlineTemp {

    //before refactor
    boolean inlineTemp() {
        int value = getValue(); 
        return (value > 3);
    }

    //after refactor
    boolean refactorInlineTemp() {
        return (getValue()>3); 
    }

    int getValue() {
        return 5; 
    }

}
