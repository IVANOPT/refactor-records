public class HideDelegate {
    public static void main(String[] args) {
        // do sth.
    }
}

class Person {
    Department department;
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department arg) {
        department = arg;
    }
}

// before refactor
class Department {
    private String chargeCode;
    private Person manager;
    public Department (Person manager) {
        this.manager = manager;
    }
    public Person getManager () {
        return manager;
    }
}

// if you want to know someone's department, you need to use 'manager = John.getDepartment().getManager();'

// after refactor
class refactorPerson {
    Department department;
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department arg) {
        department = arg;
    }   
    public Person getManager() {
        return department.getManager(); 
    }
}

// if you want to know someone's department, you need to use 'manager = John.getManager();'
