// Visitable interface
interface College {
    void accept(Visitor visitor);
}

// Concrete visitable classes
class BusinessCollege implements College {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class EngineeringCollege implements College {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// Visitor interface
interface Visitor {
    void visit(BusinessCollege businessCollege);
    void visit(EngineeringCollege engineeringCollege);
}

// Concrete visitor classes
class Student implements Visitor {
    public void visit(BusinessCollege businessCollege) {
        System.out.println("Student is visiting the Business College.");
    }

    public void visit(EngineeringCollege engineeringCollege) {
        System.out.println("Student is visiting the Engineering College.");
    }
}

class Faculty implements Visitor {
    public void visit(BusinessCollege businessCollege) {
        System.out.println("Faculty is visiting the Business College.");
    }

    public void visit(EngineeringCollege engineeringCollege) {
        System.out.println("Faculty is visiting the Engineering College.");
    }
}

class CampusVisitor implements Visitor {
    public void visit(BusinessCollege businessCollege) {
        System.out.println("Campus visitor is visiting the Business College.");
    }

    public void visit(EngineeringCollege engineeringCollege) {
        System.out.println("Campus visitor is visiting the Engineering College.");
    }
}

// Driver class
public class visitorPath {
    public static void main(String[] args) {
        // Create colleges
        College businessCollege = new BusinessCollege();
        College engineeringCollege = new EngineeringCollege();

        // Create visitors
        Visitor student = new Student();
        Visitor faculty = new Faculty();
        Visitor campusVisitor = new CampusVisitor();

        // Student visits colleges
        businessCollege.accept(student);
        engineeringCollege.accept(student);

        // Faculty visits colleges
        businessCollege.accept(faculty);
        engineeringCollege.accept(faculty);

        // Campus visitor visits colleges
        businessCollege.accept(campusVisitor);
        engineeringCollege.accept(campusVisitor);
    }
}
