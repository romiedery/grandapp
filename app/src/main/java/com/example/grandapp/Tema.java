package com.example.grandapp;

import java.util.ArrayList;

public class Tema {
        private int IdTema;
        private String Nombre;

        public int getId() {
            return IdTema;
        }

        public void setId(int idtema) {
            IdTema = idtema;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }
    static ArrayList<Tema> ListaTemas = new ArrayList();

    public ArrayList ListarTemas() {
        Tema aux = new Tema(); //Se crea un objeto Coche y se asigna su referencia a aux

        //se asignan valores a los atributos del nuevo objeto
        aux.setId(IdTema);
        aux.setNombre(Nombre);

        //se añade el objeto al final del array
        ListaTemas.add(aux);
        return ListaTemas;
    }
    }

