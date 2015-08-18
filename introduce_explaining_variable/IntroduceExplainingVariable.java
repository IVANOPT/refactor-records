public class IntroduceExplainingVariable {
    int getValueA() {
        return 5; 
    }
    int getValueB() {
        return 7; 
    }
    //before refactor
    void explainVariable() {
        if ((getValueA()>2) && (getValueB()>2)) {
            //do sth. 
        } 
    }
    //after refactor
    void refactorExplainVariable() {
        final int a = getValueA();
        final int b = getValueB();
        if (a>2 && b>2) {
            //do sth.
        }
    }

}
