package OOP_alapok.Pont.pont;

public class Pont {
    private  int x;
    private int y;

    public  Pont(){
        x=0;
        this.y=0;
    }

    public  Pont(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Pont(int n){
        this.x= koordinataGeneralasa(n);
        this.y= koordinataGeneralasa(n);
    }

    public int getX(int x){
       return x;
    }
    public  void setX(){
        this.x=x;
    }public int getY(int y){
       return y;
    }
    public  void setY(){
        this.y=y;
    }

    public  double getTavolsagAzOrigotol(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    public double tavolsag(Pont masikPont){
        return Math.sqrt(Math.pow(this.x- masikPont.x,2)+Math.pow(this.y- masikPont.y,2));
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * (2 * n + 1)) - n;
    }

    public String melyikSiknegyed(){
        if (this.x>0 && this.y>0){
            return "jobb felső síknegyedben helyezkedik el.";
        } else if (this.x>0 && this.y<0) {
            return "jobb alsó síknegyedben helyezkedik el.";
        } else if (this.x<0 && this.y>0) {
            return "bal felső síknegyedben helyezkedik el.";
        } else if (this.x<0 && this.y<0) {
            return "bal alsó síknegyedben helyezkedik el.";
        } else if (this.x==0 && this.y<0 || this.y>0) {
            return "Y tengelyen helyezkedik el.";
        } else if (this.x<0 || this.x>0 && this.y==0) {
            return  "X tengelyen helyezkedik el.";
        }
        return "Origón helyezkedik el.,";
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",this.x,this.y);
    }
}
