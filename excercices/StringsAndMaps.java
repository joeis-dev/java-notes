// "Escribe una función en Java que tome una lista de strings y devuelva un mapa donde las claves sean las 
// longitudes de los strings y los valores sean listas de los strings con esa longitud."
import java.util.*;

public class StringsAndMaps {
  public static Map<Integer, List<String>> groupByLength(String[] strings) {
    Map<Integer, List<String>> lengthMap = new HashMap<>();

    for (String str : strings) {
      int length = str.length();
      lengthMap.putIfAbsent(length, new ArrayList<>());
      lengthMap.get(length).add(str); // adds the item at the latest (new) position?
    }

    return lengthMap;
  } 

  public static void main(String args[]) {
    String[] strings = {"apple", "banana", "kiwi", "pear", "grape", "orange"};
    System.out.println(groupByLength(strings).toString());
  }
}
