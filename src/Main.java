public class Main {
    public static void main(String[] args){
        Rettangolo r = new Rettangolo(4,7);
        Cerchio c = new Cerchio(4);

        System.out.println("Area rettangolo "+r.area());
        System.out.println("perimetro rettangolo "+r.perimetro());

        System.out.println("area cerchio "+c.area());
        System.out.println("perimetro cerchio"+c.perimetro());
    }
}
