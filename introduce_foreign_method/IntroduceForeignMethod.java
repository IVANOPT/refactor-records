public class IntroduceForeignMethod {

    // before refactor
    public String introduceForeignMethod() {
        PreviousEnd previousEnd = new PreviousEnd();
        String result = "Today is "+previousEnd.getYear()+"/"+previousEnd.getMonth()+"/"+previousEnd.getDay();
        return result;    
    }

    // after refactor
    public String getDate(PreviousEnd previousEnd) {
        return previousEnd.getYear()+"/"+previousEnd.getMonth()+"/"+previousEnd.getDay();
    }

    public String refactorIntroduceForeignMethod() {
        return "Today is " + getDate(new PreviousEnd());
    }

}

class PreviousEnd {

    int getYear() {
        return 2015;
    }

    int getMonth() {
        return 8;
    }

    int getDay() {
        return 21;
    }

}
