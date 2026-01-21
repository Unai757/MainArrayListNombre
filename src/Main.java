import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Creamos nuestro arraylist
        ArrayList<String> lista = new ArrayList<>();
        //Añadimos Strings a la lista
        lista.add("Azamat");
        lista.add("Unai");
        lista.add("Hugo");
        lista.add("Daniel");
        lista.add("Julian");
        //Recorremos por primera vez la lista
        for (String s : lista) {
            System.out.println(s);
        }
        //Eliminamos el nombre de Julian
        lista.remove("Julian");
//Y recorremos de nuevo la lista pero teniendo a Julian borrado
        System.out.println("-------------------");
        System.out.println("Ahora saldrá la lista sin el nombre de Julian ya que lo eliminamos");
        for (String s2 : lista) {
            System.out.println(s2);
        }
        }
    }
