package br.com.letscode.turmaitau.carro;

public class CarroMain {

    public static void main(String[] args) {

        Carro audi = new Carro();

        audi.setModelo("A1");
        audi.setAno("2022");
        audi.setCor("Prata");
        audi.setMarca("Audi");
        audi.setPlaca("XXY1Z23");

        System.out.println(audi.toString());
    }

}
