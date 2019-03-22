import java.util.ArrayList;
import java.util.List;

public class SwitchCase {
    public static void main(String[] args) {
        List<String> stado = new ArrayList<>();
        /*stado.add("sivka");
        stado.add("burka");
        stado.add("marta");*/
        for (String el: stado) {
            switch (el) {
                case "sivka":
                    System.out.println("sivka is a good cow");
                    break;
                case "burka":
                    System.out.println("burka is a bad cow");
                    break;
                case "marta":
                    System.out.println("marta the best cow");
                    break;
            }
        }
    }
}
