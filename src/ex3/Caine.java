package ex3;


public class Caine {
    String nume;
    String rasa;
    public Caine(String nume, String rasa){
        this.nume = nume;
        this.rasa = rasa;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public static void main(String[] args) {
        Caine caine1 = new Caine("rufus","sorecar");
        Caine caine2 = new Caine("max","shitzu");
        System.out.println(caine1.nume);
        caine1.setNume("jony");
        System.out.println(caine1.nume);
    }
}
