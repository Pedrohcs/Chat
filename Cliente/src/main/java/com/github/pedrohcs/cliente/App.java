package com.github.pedrohcs.cliente;

import java.io.IOException;

public class App {

    public static void main(String []args) throws IOException{
        Cliente app = new Cliente();
        app.conectar();
        app.escutar();
    }
}
