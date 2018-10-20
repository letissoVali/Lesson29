import ru.valiullin.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Person,Integer> hashMap = new HashMap<>();
        hashMap.put( new Person("Sasha",19,'f'), 0);
        hashMap.put( new Person("Pasha",29,'m'), 1);
        hashMap.put( new Person("Masha",9,'f'), 2);
        hashMap.put( new Person("Dasha",17,'f'),3);
        hashMap.put( new Person("Alex",16,'m'), 4);
        hashMap.put( new Person("Rem",14,'f'), 5);
        hashMap.put( new Person("Rem",0,'a'), 6);

        for(Map.Entry<Person,Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + " "  + (entry.getValue()).toString() + " ");
            System.out.println(String.format("Hash %d", 15&entry.getKey().hashCode()));
        }
    }
}
