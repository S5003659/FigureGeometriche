public class Rettangolo extends Forma {

    private double altezza;
    private double lunghezza;
    
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setLunghezza(double lunghezza) {
       this.lunghezza=lunghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public Rettangolo(double altezza, double lunghezza) {
        this.altezza = altezza;
        this.lunghezza = lunghezza;
    }

    @Override
    public double area() {
        return getAltezza()*getLunghezza();
    }

    @Override
    public double perimetro() {
        return (getLunghezza()+getAltezza())*2;
    }
    
}
