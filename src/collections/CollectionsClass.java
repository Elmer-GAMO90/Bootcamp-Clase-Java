package collections;

import javax.xml.crypto.Data;
import java.lang.reflect.Type;
import java.util.*;

public class CollectionsClass {


    public static void main(String[] args) {
        //1.- List Interface implements (ArraysList, LinkedList, Vector)
        // create an ArrayList of String type
        ArrayList<String> str = new ArrayList<String>();
        //Inicializar un ArrayList con add()
        str.add("Scaler");
        str.add("Topics");
        str.add("Rocks");
        //Imprimir el ArrayList
        System.out.println("ArraysList es " + str); //Imprime todos los elementos

        //El método AsList() en Java se utiliza para devolver una lista de tamaño fijo respaldada por la matriz dada.
        //Crear un ArrayList
        ArrayList<String>scaler = new ArrayList<String>(Arrays.asList("I", "love", "Java"));
        //IMprimir
        System.out.println("ArraysList es: " + scaler);

        //Ejemplo
        ArrayList<String> str1 = new ArrayList<String>();
        //Mostrar el tamaño inicial
        System.out.println("Tamaño en el inicio: " + str1.size());
        //Agregar elementos
        str1.add("Hello");
        str1.add("Hi");
        str1.add("Namaste");
        str1.add("Bonjour");
        //Mostrar elementos
        System.out.println(str1);
        //Mostrar el tamaño
        System.out.println(str1.size());
        //Eliminar elementos con el indice 0
        str1.remove(0);
        //Mostrar el nuevo Array
        System.out.println(str1);
        //MOstrar el nuevo tamaño
        System.out.println(str1.size());


        //LinkedList Veamos un ejemplo de lista enlazada.
        //Crear una lista enlazada
        LinkedList<String> list = new LinkedList<String>();
        //Mostrar el tamaño inicial
        System.out.println("El tamaño inicial es: " + list.size());
        //Agregar elementos
        list.add("Java");
        list.add("C++");
        list.add("Javascript");
        list.add("C#");
        list.add("Kotlin");
        list.add(2, "Python");
        //Mostrar el LinkedList
        System.out.println("LinkedList original" + list);
        //Mostrar el tamaño
        System.out.println("Tamaño despues de la adición " + list.size());
        //Eliminar elemento del index 5
        list.remove(5);
        list.remove("C#");
        //Mostrar el nuwvo LinkedList
        System.out.println("Nuevo LinkedList " + list);
        //MOstrar el nuevo tamaño
        System.out.println("Tamaño despues de eliminar: " + list.size());


        //Vector
        //Crear un vector
        Vector<Integer> v = new Vector<Integer>();
        //MOstrar el tamaño del vector
        System.out.println("Tamaño inicial del vector: " + v.size());
        //Agregare elementos
        v.add(19);
        v.add(8);
        v.add(1);
        v.add(39);
        //Mostrar el vector
        System.out.println(v);
        //Mostrar el tamaño
        System.out.println("Tamaño despúes de la adición " + v.size());
        //Eliminar elemento del indice 3
        v.remove(3);
        //mostrar el vector
        System.out.println(v);
        //Mostrar el nuevo tamaño
        System.out.println("Tamaño despues de eliminar " + v.size());

        //### **4. Pila**
        //- La clase Stack extiende la clase Vector y es su subclase.
        //- Existen otros métodos como **peek(), search() y empty() que se utilizan para realizar operaciones en la pila.
        //Crear un Stack
        Stack<Integer> s = new Stack<Integer>();
        //Mostrar el tamaño inicial
        System.out.println("Tamaño en el inicio " + s.size());
        //push elementos
        s.push(99);
        s.push(28);
        s.push(17);
        s.push(74);
        s.push(1);
        //Mostrar el stack
        System.out.println("Nuevo Stack " + s);
        //Mostrar el tamaño
        System.out.println("Tamaño despues de la adición " + s.size());
        //pop el elemento y muestra esto
        System.out.println("Popped element " + s.pop());
        //Muestra el nuevo Stack
        System.out.println("Nuevo Stack despues popping " + s);
        //Muestra el nuevo tamaño
        System.out.println("Tamaño despues de eliminar " + s.size());
        //Peek metodo para encontrar el top-most elemento y mostrar esto
        System.out.println("Top-most element " + s.peek());
        //El tamaño permanece igual ya que Peek no elimina el elemento.
        System.out.println("Tamaño despues del peek " + s.size());


    }
}
