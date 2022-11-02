import java.util.Arrays;

public class Flowers {
    String name;
    int price;
    String color;

    public void getPrice(Flowers[] price) {

        int max = price[0].price;
        for (Flowers flowers : price) {
            if (flowers.price > max) {
                max = flowers.price;
            }
        }
        System.out.println("The most expensive flower: " + max);

    }

    public void getNameSort(Flowers[] name) {
        int counterRose = 0;
        int counterTulip = 0;

        for (Flowers sort : name) {
            if (sort.name.equals("Rose"))
                counterRose++;
            else
                counterTulip++;
        }
        Flowers[] rose = new Flowers[counterRose];
        Flowers[] tulip = new Flowers[counterTulip];
        for (int i = 0, j = 0, k = 0; i < name.length; i++) {
            if (name[i].name.equals("Rose")) {
                rose[j] = name[i];
                j++;
            } else {
                tulip[k] = name[i];
                k++;
            }
        }
        for (Flowers flo : rose) {
            System.out.println("flower name=" + flo.name +
                    "\nflower price=" + flo.price +
                    "\nflower color=" + flo.color);

        }
        for (Flowers flo : tulip) {
            System.out.println("flower name=" + flo.name +
                    "\nflower price=" + flo.price +
                    "\nflower color=" + flo.color);

        }
    }
}





