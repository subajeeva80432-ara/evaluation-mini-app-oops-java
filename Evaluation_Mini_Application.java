interface Evaluatable {
    void evaluate();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

class Student extends Person implements Evaluatable {
    int marks;

    Student(String name, int id, int marks) {
        super(name, id);
        this.marks = marks;
    }

    public void evaluate() {
        display();
        System.out.println("Marks : " + marks);
        if (marks >= 75) {
            System.out.println("Performance : Excellent");
        } else {
            System.out.println("Performance : Needs Improvement");
        }
    }
}

class Employee extends Person implements Evaluatable {
    int rating;

    Employee(String name, int id, int rating) {
        super(name, id);
        this.rating = rating;
    }

    public void evaluate() {
        display();
        System.out.println("Rating : " + rating);
        if (rating >= 4) {
            System.out.println("Performance : Outstanding");
        } else {
            System.out.println("Performance : Satisfactory");
        }
    }
}

class Main {
    public static void main(String[] args) {

        Evaluatable e1 = new Student("Arun", 101, 82);
        Evaluatable e2 = new Employee("Meena", 201, 5);

        e1.evaluate();
        System.out.println();
        e2.evaluate();
    }
}