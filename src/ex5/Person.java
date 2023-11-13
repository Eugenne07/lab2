package ex5;
import java.util.Arrays;
//Creati o clasa Person cu proprietatile name si email + gettere si settere.
//  Creati o clasa Student care mosteneste clasa Person si are ca proprietate 'grades' un array de numere intregi.
//  Creati o clasa Profesor care mosteneste clasa Person si are ca proprietate 'courses' un array de string.
//  Instatati toate cele 3 clasa in clasa main si studiati punctele comune si diferentele de pe obiecte
public class Person {
    private String name,email;
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public static class Student extends Person{
        private int[] grades;
        public void setGrades(int[] grades) {
            this.grades = grades;
        }
        public int[] getGrades() {
            return grades;
        }
    }
    public static class Profesor extends Person{
        private String[] courses;
        public void setCourses(String[] courses) {
            this.courses = courses;
        }
        public String[] getCourses() {
            return courses;
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mihai Persoana");
        person.setEmail("mihaipersoana@gmail.com");

        Student student = new Student();
        student.setName("Andrei Studentul");
        student.setEmail("andreistudentul@gmail.com");
        student.setGrades(new int[] {3,5,8,10});

        Profesor profesor = new Profesor();
        profesor.setName("Norbi Profesorul");
        profesor.setEmail("norbiprofesorul@gmail.com");
        profesor.setCourses(new String[] {"Java","JavaScript","SQL"});

        System.out.println("Numele persoanei este " + person.getName() + " si emailul este " + person.getEmail());
        System.out.println("Numele studentului este " + student.getName() + ", emailul este " + student.getEmail() + " si notele sale sunt: " + Arrays.toString(student.getGrades()));
        System.out.println("Numele profesorului este " + profesor.getName() + ", emailul este " + profesor.getEmail() + " si cursurile predate de el sunt: " + Arrays.toString(profesor.getCourses()));
    }
}
