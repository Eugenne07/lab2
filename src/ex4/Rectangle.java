package ex4;
/*Creati o clasa Rectangle cu proprietarile width si length,
creati gettere si settere si metode care calculeaza aria respectiv perimetrul.*/

public class Rectangle {
    int width,length;
    public void setWidth(int width){
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int aria(){
        return this.getWidth() * this.getLength();
    }
    public int perimetru(){
        return this.getLength() + this.getWidth();
    }

    public static void main(String[] args) {
        Rectangle patrat = new Rectangle();
        patrat.setLength(10);
        patrat.setWidth(5);
        System.out.println("patratul are " + patrat.getWidth() + " cm latime");
        System.out.println("patratul are " + patrat.getLength() + " cm lungime");
        System.out.println("patratul are aria de " + patrat.aria() + " cm");
        System.out.println("patratul are perimentrul de " + patrat.perimetru() + " cm");
    }

}
