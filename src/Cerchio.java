public class Cerchio extends Forma {


    private double raggio;

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }


    @Override
    public String toString() {
        return "Cerchio [raggio=" + raggio + "]";
    }

    //go to References riporta dov'è usato questo metodo.
    @Override
    public double area() {
        //go to definition ( Riporta alla classe dove è stato definito per esempio la variabile PI )
        return Math.PI*Math.pow(getRaggio(), 2);
    }


    //go to super implementation ( riporta al metodo della super classe per il quale si è svolto l'override )
    //PEEK CALL HIERARCHY AGAIN , mostra dove viene richiamato il metodo ( chiamata in uscita  ) o quali metodi richiama al suo interno (chiamata in entrata )
    @Override
    public double perimetro() {
        return 2*Math.PI*getRaggio();
    }
    
}

// PEEK , serve per dare una ' SBIRCIATA ' al risultato della go to Definition , implementation , references ecc... senza andare direttamente nel file.
//              - Funzione in più si può passare alla go to dopo aver sbirciato.



