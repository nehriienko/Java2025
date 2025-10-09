//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("red");
        color.add("blue");
        color.add("green");
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        color.add(0, "red");
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        System.out.println(color.get(1));
        color.set(0, "yellow");
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        System.out.println(color.remove(2));
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        System.out.println(color.contains("blue"));
        System.out.println(color.contains("red"));
        Collections.sort(color);
        System.out.println();
        for (String i : color ) {
            System.out.println(i);
        }
        ArrayList<String> color2 = (ArrayList)color.clone();
        System.out.println();
        for (String i : color2 ) {
            System.out.println(i);
        }
    }
}