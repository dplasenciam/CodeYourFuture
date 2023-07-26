/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package collectionstheory;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.HashSet;

    /**
     *
     * @author Daniel Plasencia
     */
    public class AddElement {

       public static void main(String[] args){

           // LISTS

                ArrayList<Integer> numerosA = new ArrayList(); // lista de tipo Integer
                int x = 20;
                numerosA.add(x); // Agregamos el numero 20 a la lista, en la posición 0

           // SETS

                HashSet<Integer> numerosB = new HashSet();
                Integer y = 20;
                numerosB.add(y);

           // MAPS

                HashMap<Integer, String> alumnos = new HashMap();
                int dni = 72522680;
                String nombreAlumno = "Daniel";
                alumnos.put(dni, nombreAlumno);
       }

    }
