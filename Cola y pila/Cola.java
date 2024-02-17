package org.example;

public class Cola <T>{
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;

    public Cola() {
        this.frente = null;
        this.fin = null;
        this.tamanio = 0;
    }

    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (frente == null) {
            frente = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
        }
        fin = nuevoNodo;
        tamanio++;
    }

    public T desencolar() {
        if (frente == null) {
            return null;
        }
        T dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        tamanio--;
        return dato;
    }

    public T verFrente() {
        if (frente == null) {
            return null;
        }
        return frente.getDato();
    }

    public int getLenght() {
        return tamanio;
    }


}
