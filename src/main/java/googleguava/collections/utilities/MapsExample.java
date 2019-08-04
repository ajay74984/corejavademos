package googleguava.collections.utilities;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

    final ImmutableMap<String, String> immutableMap = ImmutableMap
            .of("bcd", "Value",
                    "acd", "New Value");
    @Test
    public void testSort(){
        TreeMap<String, String> treeMap = Maps.newTreeMap();
        treeMap.putAll(immutableMap);

        treeMap.entrySet().forEach(entry ->
                System.out.println("Key " + entry.getKey()
                + " Value " + entry.getValue()));
    }
}
