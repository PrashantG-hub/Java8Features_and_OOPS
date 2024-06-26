import java.util.HashMap;
import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        Optional<String> name=getName(2);
        String val = name.orElse("NA");
        System.out.println(val.length());
    }
    static Optional<String> getName(int id) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1,"Prashant");
        hm.put(2,"Amar");
        return Optional.ofNullable(hm.get(id));
    }
}
