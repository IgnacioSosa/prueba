package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Foto foto = new Foto();
        Contrato contrato1 = new Contrato();
        Contrato contrato2 = new Contrato();
        Word word = new Word();

        Impresora impresora = new Impresora();

        impresora.agregarImprimible(foto);
        impresora.agregarImprimible(contrato1);
        impresora.agregarImprimible(contrato2);
        impresora.agregarImprimible(word);

        impresora.imprimprimirTodo();
    }
}
