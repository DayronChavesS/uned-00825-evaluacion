/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazadaOrdenada;

import Estadia.Estadia;

/**
 *
 * @author user
 */
public class ListaEnlazadaOrdenada <AnyType extends Comparable<? super AnyType>> 
                                            extends ListaEnlazada<AnyType>
{
   
    //se sobreescribe el insertar nodo original de la lista enlazada, de modo que redirigia al que lo inserta ordenadamente.
    @Override
    public void InsertarNodo(Estadia NodoPorParametro, Iterador<AnyType> PosicionActual)
    {
        InsertarNodo( NodoPorParametro );
    }
    
    
    //se intenta insertar un elemento en la lista de forma ordenada
    public void InsertarNodo (Estadia NodoPorParametro)
    {
        Iterador<AnyType> NodoAnterior = Obtener_Cabecera();
        Iterador<AnyType> NodoActual = Obtener_Primer_Elemento();
        
        while (NodoActual.EsValido() && NodoPorParametro.monto > NodoActual.PosicionActual.Dato.monto)
        {
            NodoAnterior.Avanzar();
            NodoActual.Avanzar();
        }
        
        super.InsertarNodo(NodoPorParametro, NodoAnterior);
    }
    
    
    
}
