import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

public class Bruh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\ahmed\\Desktop\\no.txt"));
        LinkedList<Integer> gr = new LinkedList<Integer>() ;
        while (sc.hasNextInt()){
            gr.push(sc.nextInt());
        }
        Iterator<Integer> IT = gr.iterator();
        sc.close();
        while (IT.hasNext()) {
            System.out.println(IT.next());
        }
    }
}
