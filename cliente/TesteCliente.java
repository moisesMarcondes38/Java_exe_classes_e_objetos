package cliente;

import cliente.model.Cliente;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(123,"Moises","04397230","Sao paulo","32456798734");
        Cliente c2 = new Cliente(321,"Daniel","04397239","Santos","12456798734");

        c1.visualizar();
        c2.visualizar();
    }
}
