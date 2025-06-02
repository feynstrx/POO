package POO;

public class SuperHeroi {
    int idade;
    float altura, peso;



    public SuperHeroi () {
        idade =24;
        altura = 192;
        peso = 86;
    }
    public static void main(String[] args) {
        SuperHeroi dialogo = new SuperHeroi();
        System.out.println(dialogo.idade);
        System.out.println(dialogo.altura);
        System.out.println(dialogo.peso);
    }

}