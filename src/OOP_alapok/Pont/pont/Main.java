package OOP_alapok.Pont.pont;

import OOP_alapok.Pont.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1=new Pont();
        Pont p2=new Pont(3,6);
        Pont p3=new Pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.printf("A  %s pont távolsága az origótól %.3f",p3, p3.getTavolsagAzOrigotol());
        System.out.printf("A  %s pont távolsága az %s ponttól %.3f",p2,p3, p2.tavolsag(p3));
        
        Pont pontok[]=new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i]=new Pont(15);
        }
        for (Pont p:pontok) {
            System.out.println(p);
        }
    }
}
