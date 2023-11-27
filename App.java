import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> nameList = new ArrayList<String>();

        String[] names = {"Sam", "Jessica", "Mark", "Alexis"};;
        for(int i = 0; i < names.length; i++){
            nameList.add(names[i]);
        }

        System.out.println(nameList);
    }
}
