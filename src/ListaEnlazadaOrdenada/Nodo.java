/*
UNIVERSIDAD ESTATAL A DISTANCIA
VICERRECTORIA ACADÉMICA
ESCUELA DE CIENCIAS EXACTAS Y NATURALES
CARRERA DE INGENIERÍA INFORMÁTICA

PROYECTO EVALUATIVO
LISTAS ENLAZADAS

GRUPO 03
PROFESORA MIRIAM MORA MORALES

DAYRON ANTONY CHAVES SANDOVAL
305240018

CENTRO UNIVERSITARIO DE TURRIALBA

FECHA DE ENTREGA
25 DE ABRIL DEL 2021

PRIMER CUATRIMESTRE, 2021.
*/

package ListaEnlazadaOrdenada;

//clase creadora de los nodos de la lista enlazada

import Estadia.Estadia;

public class Nodo<AnyType>
{
    //variable que contiene la informacion, puede ser de cualquier tipo
    public Estadia Dato;
    //apuntador al siguiente nodo de la lista
    public Nodo Siguiente;
    
    
    public Nodo( Estadia Dato)
    {
        this(Dato, null);
    }
    
    public Nodo( Estadia DatoPorParametro, Nodo<AnyType>  n)
    {
        Dato = DatoPorParametro; 
        Siguiente = n;
    }
}
