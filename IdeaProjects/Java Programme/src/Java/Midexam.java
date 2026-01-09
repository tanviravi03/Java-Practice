package Java;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            if (age>0 && age<120)
          this.age = age;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "Person: Name: "+name+" | Age: "+age;
    }
}

class Studen extends Person {
    String major;

    public Studen (String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getDetails() {
        return "Student: Major: "+major+" | Name: "+getName()+" | Age: "+getAge();
    }
}

class Professor extends Person {
    String department;
    Studen [] thesisstudens;
    int c = 0;

    @Override
    public String getDetails() {
        return "Professor: Name: "+getName()+" | Age: "+getAge()+ " | Department: "+department;
    }

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
        thesisstudens = new Studen [5];
    }

    public void addthesisstude (Studen s) {
        if (c < thesisstudens.length) {
            thesisstudens[c] = s;
            c++;
        }
        else
            System.out.println("Maximum capacity reached");
    }

    public void thesisstudeninfo () {
        for (int i=0; i<c;i++)
            System.out.println(thesisstudens[i].getDetails());
    }
}

class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public Course(String code) {
        this.code = "TBD";
    }

    public void courseinfo() {
        System.out.println("Code: " + code + " | Title: " + title);
    }

    public void courseinfosinglepera() {
        System.out.println("Code: " + code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
class Enrollment {
        Studen student;
        Course course;
        Professor professor;
        double grade=-1;

    public Enrollment(Studen student, Course course, Professor professor) {
        this.student = student;
        this.course = course;
        this.professor = professor;
    }

    void assigngrade (double g) {
        if (g>=0 && g<=100)
            this.grade=g;
    }

    public String getReport() {
        if (grade == -1) {
            return student.getName() + " enrolled in " +
                    course.getTitle() + " under " +
                    professor.getName() + " Grade: Pending";
        }

        return student.getName() + " enrolled in " +
                course.getTitle() + " under " +
                professor.getName() + " Grade: " + grade;
    }

}

public class Midexam {
    public static void main(String[] args) {
        Professor p1 = new Professor("Faculty1", 34, "CSE");
        Professor p2 = new Professor("Faculty2", 43, "EEE");

        Studen s1 = new Studen("Tanvir",20, "CSE");
        Studen s2 = new Studen("Ahmed",21, "EEE");
        Studen s3 = new Studen("Avi",22, "CE");
        Studen s4 = new Studen("Arko",23, "ME");
        Studen s5 = new Studen ("Sonamoni", 5, "Dudhvat");

        Studen x1 = new Studen("Tanvir",20, "CSE");
        Studen x2 = new Studen("Ahmed",21, "EEE");
        Studen x3 = new Studen("Avi",22, "CE");
        Studen x4 = new Studen("Arko",23, "ME");
        Studen x5 = new Studen ("Sonamoni", 5, "Dudhvat");

        Person[] persons = {  p1, s1, s2, s3, s4, s5, p2, x1, x2, x3, x4, x5 };
//
//        p1.addthesisstude(s1);
//        p1.addthesisstude(s2);
//        p1.addthesisstude(s3);
//        p1.addthesisstude(s4);
//
//        System.out.println(p1.getDetails());
//        p1.thesisstudeninfo();
//        System.out.println(p2.getDetails());
//
        Course c1= new Course("101");
        Course c2= new Course("102","SPL");
        Course c3 = new Course ("103","OOP");
        c1.courseinfosinglepera();
        c2.courseinfo();

        Enrollment e1 = new Enrollment(s1, c2, p1); // Tanvir in SPL under Faculty1
        Enrollment e2 = new Enrollment(s2, c3, p2); // Ahmed in SPL under Faculty1

        e1.assigngrade(-10);
        e2.assigngrade(87);

        Enrollment[] enrollments = { e1, e2 };
        for (Enrollment p : enrollments)
            System.out.println(p.getReport());

        int i=0;
        for (Person s : persons) {
            System.out.println(s.getDetails());
            i++;
            if (i%6==0)
                System.out.println();
        }
    }
}