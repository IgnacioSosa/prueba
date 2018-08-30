package com.company;

import java.util.ArrayList;

public class Impresora {
    //ATRIBUTOS

    private ArrayList<Imprimible> lista = new ArrayList<>();

    //METODOS
    public void imprimprimirTodo() {
        for (Integer i = 0; i < lista.size(); i++) {

            Imprimible imprimibleEnposicion = lista.get(i);
          // imprimibleEnposicion.imprimir();
            String texto = imprimibleEnposicion.imprimir();

            System.out.println(texto);
        }

        lista.clear();
    }

    public void  agregarImprimible(Imprimible imprimible){

        lista.add(imprimible);
    }
}