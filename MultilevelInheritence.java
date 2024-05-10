class Human {
    String name;
    String gender;

    Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void eat() {
        System.out.println("Human can Eat");
    }

    void walk() {
        System.out.println("Human can Walk");
    }

    void think() {
        System.out.println("Human can Think");
    }

    void speak() {
        System.out.println("Human can speak");
    }

    void displayHuman() {
    	System.out.println(); 
        System.out.println("***Human Details**");
        System.out.println("Human Name: " + this.name);
        System.out.println("Human gender: " + this.gender);
    }
}

class Graduation extends Human {
    String course;
    int duration;
    String branch;
    String university;
    int yop;

    Graduation(String course, int duration, String branch, String university, int yop, String name, String gender) {
        super(name, gender);
        this.course = course;
        this.duration = duration;
        this.branch = branch;
        this.university = university;
        this.yop = yop;
    }

    void displayGraduation() {
    	System.out.println();
        System.out.println("** Graduation Details**");
        System.out.println("Graduation Course: " + this.course);
        System.out.println("Graduation duration: " + this.duration);
        System.out.println("Graduation branch: " + this.branch);
        System.out.println("Graduation university: " + this.university);
        System.out.println("Graduation YOP: " + this.yop);
    }
}

class PostGraduation extends Graduation {
    String specil;
    int durationpg;
    int yoppg;
    String universitypg;

    PostGraduation(String specil, int durationpg, int yoppg, String universitypg, String course, int duration, String branch, String university, int yop, String name, String gender) {
        super(course, duration, branch, university, yop, name, gender);
        this.specil = specil;
        this.durationpg = durationpg;
        this.yoppg = yoppg;
        this.universitypg = universitypg;
    }

    void displayPostGraduation() {
    	System.out.println();
        System.out.println("**PG Details**");
        System.out.println("PG Specialization: " + this.specil);
        System.out.println("PG duration: " + this.durationpg);
        System.out.println("PG yop: " + this.yoppg);
        System.out.println("PG university: " + this.universitypg);
    }
}

class Job extends PostGraduation {
    String company;
    double salary;
    String destination;
    String location;

    Job(String company, double salary, String destination, String location, String specil, int durationpg, int yoppg, String universitypg, String course, int duration, String branch, String university, int yop, String name, String gender) {
        super(specil, durationpg, yoppg, universitypg, course, duration, branch, university, yop, name, gender);
        this.company = company;
        this.salary = salary;
        this.destination = destination;
        this.location = location;
    }

    void displayJob() {
    	System.out.println();
        System.out.println("**Job Details**");
        System.out.println("Job Company: " + this.company);
        System.out.println("Job salary: " + this.salary);
        System.out.println("Company destination: " + this.destination);
        System.out.println("Company location: " + this.location);
    }
}

public class MultilevelInheritence {
    public static void main(String[] args) {
        Job obj = new Job("Tcs", 70000, "ASS. SE", "PUNE", "CYBER SEC", 2, 2026, "SPPU", "Engineering", 4, "Computer Science", "MIT", 2024, "John", "Male");
        obj.displayJob();
        obj.displayPostGraduation();
        obj.displayGraduation();
        obj.displayHuman();
    }
}

/*
Output:

**Job Details**
Job Company: Tcs
Job salary: 70000.0
Company destination: ASS. SE
Company location: PUNE

**PG Details**
PG Specialization: CYBER SEC
PG duration: 2
PG yop: 2026
PG university: SPPU

** Graduation Details**
Graduation Course: Engineering
Graduation duration: 4
Graduation branch: Computer Science
Graduation university: MIT
Graduation YOP: 2024

***Human Details**
Human Name: John
Human gender: Male
*/
