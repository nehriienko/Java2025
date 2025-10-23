//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //1. створення нового списку масиву (ArrayList), додавання кількох кольорів (рядків) і виведення колекції
        ArrayList<String> color = new ArrayList<String>();
        color.add("red");
        color.add("blue");
        color.add("green");
        //2. ітерація по всіх елементах списку масиву
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        //3. вставка елемента у список масиву на першу позицію
        color.add(0, "red");
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i)); //4. отримання елемента (за заданим індексом) зі списку масиву
        }
        System.out.println(color.get(1));
        color.set(0, "yellow"); //5. оновлення конкретного елемента списку заданим елементом
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        System.out.println(color.remove(2)); //6. видалення третього елемента зі списку масиву
        System.out.println();
        for (int i = 0; i < color.size(); i++)
        {
            System.out.println(color.get(i));
        }
        System.out.println(color.contains("blue")); //7. пошук елемента у списку масиву
        System.out.println(color.contains("red"));
        Collections.sort(color); //8. сортування заданого списку масиву
        System.out.println();
        for (String i : color ) {
            System.out.println(i);
        }
        ArrayList<String> color2 = (ArrayList)color.clone(); //9. копіювання одного списку масиву в інший
        System.out.println();
        for (String i : color2 ) {
            System.out.println(i);
        }
        //10. реверсування елементів у списку масиву (метод reverse() класу Collections)
        Collections.reverse(color);
        System.out.println(color);
        //11. порівняння двох списків масиву (метод equals)
        ArrayList<String> otherColors = new ArrayList<String>();
        otherColors.add("red");
        otherColors.add("blue");
        otherColors.add("green");
        boolean areEqual = color.equals(otherColors);
        System.out.println();
        System.out.println(areEqual);
        //12. очищення списку масиву (метод isEmpty)
        color2.clear();
        System.out.println();
        //13. перевірка, чи список масиву є порожнім
        System.out.println(color2.isEmpty());
        System.out.println(color.isEmpty());
        System.out.println();
        //14. збільшення розміру списку масиву
        color.ensureCapacity(10);
        //15. обрізання місткості списку масиву до поточного розміру (метод trimToSize)
        ((ArrayList)color).trimToSize();

    }
}