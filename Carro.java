package poo;

public class Carro {

    String marca, modelo, placa, cor;
    int ano, km;

    public Carro(String marcaCarro, String carroModelo, String carroPlaca, String carroCor, int carroAno, int carroKm) {
        marca = marcaCarro;
        modelo = carroModelo;
        placa = carroPlaca;
        cor = carroCor;
        ano = carroAno;
        km = carroKm;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Bugatti", "Chiron", "CAM999", "Preto", 2000, 99999);
        Carro carro2 = new Carro("McLaren", "P1", "FAA989", "Laranja", 2010, 1000);
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println(carro1.placa);
        System.out.println(carro1.cor);
        System.out.println(carro1.km);
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
        System.out.println(carro2.placa);
        System.out.println(carro2.cor);
        System.out.println(carro2.km);
    }
}
