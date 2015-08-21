public class IntroduceLocalExtension {
    
}

class MfDateSub extends Date {
    public MfDateSub (String dateStr) {
        super (dateStr); 
    }

   // ||

    public MfDateSub (Date arg) {
        super(arg.getTime()); 
    }

    // add extend functions
    Date nextDay() {
        return new Date();
    }
    
}
