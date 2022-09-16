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

    @Override
    public String toString() {
        return String.format("(%d,%d)",this.x,this.y);
    }
}
