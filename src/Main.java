import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Flowers flower=new Flowers();
        Flowers rose1=new Flowers();
        rose1.name="Rose";
        rose1.color="Blue";
        rose1.price=2000;

        Flowers rose2=new Flowers();
        rose2.name="Rose";
        rose2.color="Red";
        rose2.price=7000;

        Flowers rose3=new Flowers();
        rose3.name="Rose";
        rose3.color="White";
        rose3.price=4000;

        Flowers tulip1=new Flowers();
        tulip1.name="Tulip";
        tulip1.color="Blue";
        tulip1.price=2000;

        Flowers tulip2=new Flowers();
        tulip2.name="Tulip";
        tulip2.color="Red";
        tulip2.price=900;

        Flowers tulip3=new Flowers();
        tulip3.name="Rose";
        tulip3.color="White";
        tulip3.price=800;

        Flowers[] flowers={rose1,rose2,rose3,tulip1,tulip2,tulip3};

        flower.getPrice(flowers);

        flower.getNameSort(flowers);





    }

}