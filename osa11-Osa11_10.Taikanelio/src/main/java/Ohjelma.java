
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa Taikanelio-luokkaasi täällä

        Taikaneliotehdas tt = new Taikaneliotehdas();
        Taikanelio nelio = tt.luoTaikanelio(9);
        System.out.println(nelio);
        System.out.println(nelio.rivienSummat());
        System.out.println(nelio.sarakkeidenSummat());
        System.out.println(nelio.lavistajienSummat());
    }
}
