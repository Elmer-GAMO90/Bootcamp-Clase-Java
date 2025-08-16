package collections;

import java.util.*;

public class CollectionsGuide {
    public static void main(String[] args) {
        //Sistema de calificaciones
        List<Double> calificaciones = new ArrayList<>();
        calificaciones.add(11.4);
        calificaciones.add(11.4);
        calificaciones.add(11.4);
        calificaciones.add(11.4);
        calificaciones.add(11.4);


        //Sacar el suma
        double suma = 0;
        for(Double calificacion : calificaciones){
            suma += calificacion;

        }

        double promedio = suma / calificaciones.size();
        System.out.println("Promedio" + promedio);

        //ENcontrar el minimo y maximo
        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);

        //Set
        //Ejemplo a usar en código de barras
        Set<String> paises = new HashSet<>();
        paises.add("Peru");
        paises.add("Colombia");
        paises.add("Panama");
        //No lo va agregar, lo va ignorar
        paises.add("Peru");
        for (String pais : paises){
            System.out.println(pais);
        }

        //Intefaces Maps (clave valor)
        //NO necesitas el orden utiliza la implementacion del HashMap
        //Si necesitas el orden por insercion o LRU utiliza la implementacion del LinkedHasMap
        //Orden por comparador TreMap
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Pepito", 28);
        edades.put("Uriel", 23);
        edades.put("Paula", 21);

        System.out.println("La edad de Paula es:" + edades.get("Paula"));
        System.out.println("La personal Uriel existe en la lista? " + edades.containsKey("Uriel"));
        //COmo iterar un mapa
        //Utiliza Biconsumer
        edades.forEach((clave, valor) -> System.out.println(clave + "Tiene a " + valor));
        //Utilizar un for, con una variable tipo var,
        for (var e : edades.entrySet()){
            String nombre = e.getKey();
            Integer edad = e.getValue();
            System.out.println(nombre + "->" + edad);
        }

        //Los Streams es una nueva forma de iterar


        //Interface Comparable

        //Queue
        Queue<Integer> q1 = new ArrayDeque<>();



        //Dentro la lista defines los metodos
        //La implementación esta en el ArraysList

        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Kotlin");
        lenguajes.add("Java");
        lenguajes.add("C#");
        lenguajes.add("Pyton");
        lenguajes.add("Typescript");

        //Como recorrer la lista
        for (String lenguaje : lenguajes){
            System.out.println(lenguaje);
        }
        lenguajes.sort(Comparator.comparing(String::length));
        //Comparar
        System.out.println("el elemento Java existe? " + lenguajes.contains("Java"));
        //Jalar elemento en base a su posicipn
        System.out.println("El elemnto del indice 1 " + lenguajes.get(1));
        //Removiendo el ultimo lenguaje
        //Reemplazar indice
        System.out.println();
        lenguajes.set(3, "Golan");
        System.out.println("Removiendo el ultimo elemento");
        lenguajes.remove(4);

        for (String lenguaje : lenguajes){
            System.out.println(lenguaje);
        }
    }
}
