package collections;

import java.util.*;

public class CollectionsGuide {
    public static void main(String[] args) {
        //Sistema de calificaciones
        List<Double> calificaciones = new ArrayList<>();
        calificaciones.add(11.4);
        calificaciones.add(19.0);
        calificaciones.add(13.4);
        calificaciones.add(14.4);
        calificaciones.add(16.4);

        //Sacar el total de las notas
        double suma = 0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        //Calcular el promedio
        double promedio = suma / calificaciones.size();
        System.out.println("Su promedio es: " + promedio);

        //Encontrar el minimo y maximo
        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("La nota alta y mínima es: " + max + " y " + min);
        //Buscar un elemento
        System.out.println("La nota 18 existe en mi lista? " + calificaciones.contains(18.0));

        //Set
        //Ejemplo a usar en código de barras
        Set<String> paises = new HashSet<>();
        paises.add("Peru");
        paises.add("Colombia");
        paises.add("Panama");
        //No lo va agregar, lo va ignorar
        paises.add("Peru");
        for (String pais : paises) {
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

        //Utilizar un for, con una variable de tipo var
        for (var e : edades.entrySet()) {
            String nombre = e.getKey();
            Integer edad = e.getValue();
            System.out.println(nombre + "->" + edad);
        }

        //Los Streams es una nueva forma de iterar
        //default void forEach(BiConsumer<? super K, ? super V> action)
        edades.forEach((clave, valor) -> System.out.println(clave + "Tiene " + valor));


        //Interface Comparable

        //Queue
        //Crear una clase Persona, lo que hace el queue es un ordemamiento por edad,
        //Hay que agregar los getters y setters,
        //Alt + INS para agregar constructor
        Queue<Persona> cola = new PriorityQueue<>(Comparator.comparing(Persona::getNombre));
        Persona hola = new Persona("Luis", 29);
        cola.add(new Persona("Luis", 29));
        cola.add(new Persona("Andre", 24));

        for (Persona persona : cola) {
            System.out.println(persona.nombre);
        }

        //=============================================================================
        //Esto es solo un ejemplo
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
        System.out.println("Establecer un nuevo valor en la lista");
        lenguajes.set(3, "Golan");
        System.out.println("Removiendo el ultimo elemento");
        lenguajes.remove(4);

        for (String lenguaje : lenguajes){
            System.out.println(lenguaje);
        }
    }
    //=============================================================================

        //Collection Queue
        public static class Persona implements Comparable<Persona> {
            private String nombre;
            private int edad;

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

            public Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            @Override
            public int compareTo(Persona o) {
                return Integer.compare(this.edad, o.edad);
            }
        }
    }

