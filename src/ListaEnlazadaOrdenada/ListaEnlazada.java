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

import Estadia.Estadia;



public class ListaEnlazada<AnyType>
{
    //se crea un nodo cabecera para evitar problemas de inserccion
    private Nodo<AnyType> Cabezera;
    
    public ListaEnlazada()
    {
        Cabezera =  new Nodo<AnyType>(null);
    }
    
    //¿la lista esta vacia?
    public boolean EstaVacia()
    {
        return Cabezera.Siguiente == null;
    }
    
    //Vaciar la lista
    public void Vaciar()
    {
        Cabezera.Siguiente = null;
    }        
    
    //se retorna la cabeza de la lista
    public Iterador<AnyType> Obtener_Cabecera()
    {
        return new Iterador<AnyType> ( Cabezera );
    }
    
    //se retorna el primer elemento de la lista
    public Iterador<AnyType>  Obtener_Primer_Elemento()
    {
        return new Iterador<AnyType> ( Cabezera.Siguiente );
    }
    
    public static <AnyType> void ImprimirLista (ListaEnlazada<AnyType> LaLista )
    {
        if(LaLista.EstaVacia())
            System.out.print("La lista esta vacia");
        else
        {
            Iterador<AnyType> Iterador = LaLista.Obtener_Primer_Elemento();
                for (; Iterador.EsValido(); Iterador.Avanzar())
                    System.out.print(Iterador.DevolverElemento() + " ");
        }
        
        System.out.println();
    }
    
    public Iterador<AnyType> Encontrar (AnyType NodoPorParametro)
    {
        Nodo<AnyType> Iterador = Cabezera.Siguiente;
        
        while (Iterador != null && !Iterador.Dato.equals(NodoPorParametro))
            Iterador = Iterador.Siguiente;
        
        return new Iterador<AnyType>(Iterador);
    }
    
        public Iterador<AnyType> EncontrarAnterior (AnyType NodoPorParametro)
    {
        Nodo<AnyType> Iterador = Cabezera;
        
        while (Iterador != null && !Iterador.Dato.equals(NodoPorParametro))
            Iterador = Iterador.Siguiente;
        
        return new Iterador<AnyType>(Iterador);
    }
    
    //se intenta remover un elemento en la lista
    public void Remover(AnyType NodoPorParametro)
    {
        Iterador<AnyType> PosicionAnterior = EncontrarAnterior(NodoPorParametro);
        if(PosicionAnterior.PosicionActual.Siguiente != null)
            PosicionAnterior.PosicionActual.Siguiente = PosicionAnterior.PosicionActual.Siguiente.Siguiente;
    }
    
    
    public void InsertarNodo(Estadia NodoPorParametro, Iterador<AnyType> PosicionAnterior)
    {
        if(PosicionAnterior != null && PosicionAnterior.PosicionActual != null)
            PosicionAnterior.PosicionActual.Siguiente = new Nodo<AnyType>(NodoPorParametro, PosicionAnterior.PosicionActual.Siguiente);
    }

}
