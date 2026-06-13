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

//clase que itera atraves de la lista enlazada

import Estadia.Estadia;

public class Iterador<AnyType>
{
    public static Nodo<Estadia> PosicionActual;
    
    //avanza al siguiente nodo de la lista si es valido
    public void Avanzar()
    {
        if (EsValido())
            PosicionActual = PosicionActual.Siguiente;
    }
    
    //determina si el siguiente elemento es valido o no
    //dependiendo de si este es nulo
    public boolean EsValido()
    {
        return PosicionActual != null;
    }
    
    //retorna el elemento iterado si este no es nulo, de lo contrario retorna nulo.
    public Estadia DevolverElemento()
    {
        return EsValido() ? PosicionActual.Dato : null;
    }
}
