import java.util.*;
public class LambdaExpressions {
    public static void main(String[] args) {

        // ---------------- SORT INTEGER TREESET USING LAMBDA EXPRESSION --------------
        Set<Integer> set=new TreeSet<Integer>((e1,e2)->(e1>e2)? 1: e1<e2 ? -1 :0);
        set.add(7);
        set.add(90);
        set.add(87);
        set.add(190);
        set.add(-18);
        System.out.print(set);
        System.out.println();

// ---------------------SORT INTEGER LIST USING LAMBDA EXPRESSION--------------
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(37);
        list.add(1);
        list.add(-8);
        Collections.sort(list, (o1,o2)->(o1>o2)? -1:(o1<o2) ? 1:0);
        System.out.print(list);

// ------------------SORT STRING LIST USING LAMBDA EXPRESSION--------------
        List<String> Stringlist=new ArrayList<>();
        Stringlist.add("Prashant");
        Stringlist.add("Aman");
        Stringlist.add("Amar");
        Stringlist.add("Vivek");
        Stringlist.add("Rahul");
        Collections.sort(Stringlist, (s1,s2)-> (s2.compareToIgnoreCase(s1)));
        System.out.print(Stringlist);

// ------------------ SORT TREEMAP USING LAMBDA EXPRESSION --------------
        Map<Integer,String> hm=new TreeMap<>((e1,e2)-> ((e1>e2 ? 1: e2>e1 ? -1:0)));
        hm.put(1, "Devil");
        hm.put(6, "Karan");
        hm.put(3, "Arush");
        hm.put(8, "Varun");
        hm.put(5, "Aman");

        System.out.print(hm);
    }
}