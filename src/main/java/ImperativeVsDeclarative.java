import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static  void main(String[] args) {
        int sumaOfEvents = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumaOfEvents += i;
            }
        }
        System.out.println(sumaOfEvents);

        //decalrative or funcional
        //funciona mucho mejor al trabajar con threads
        

         sumaOfEvents = IntStream.rangeClosed(0, 100)
        .filter(i->i%2 == 0)
        .reduce((x,y)->x+y)
                .getAsInt();
    }
}
