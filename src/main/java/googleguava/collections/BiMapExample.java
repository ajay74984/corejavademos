package googleguava.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.HashBiMap;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BiMapExample {

   // BiMap<State, String> biMap = EnumHashBiMap.create(State.class);

    enum State{
        OEPN,
        CLOSE;
    }

    @Test
    public void testBiMap(){
        BiMap<String, String> biMap = HashBiMap.create();

        biMap.put("IND", "India");
        biMap.put("SL", "Sri Lanka");
        biMap.put("NPL", "Nepal");

        String valueFromKey = biMap.get("IND");
        assertThat(valueFromKey).isEqualTo("India");

        String keyFromValue = biMap.inverse().get("India");
        assertThat(keyFromValue).isEqualTo("IND");

        System.out.println("Size of map=" + biMap.size());
    }

    @Test
    public void testDuplicateValueExample(){
        BiMap<String, String> biMap = HashBiMap.create();

        biMap.put("IND", "India");
        biMap.put("SL", "Sri Lanka");

        assertThatThrownBy(()-> biMap.put("NPL", "India"))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    public void testForcePut(){
        BiMap<String, String> biMap = HashBiMap.create();

        biMap.put("IND", "India");
        biMap.put("SL", "Sri Lanka");
        biMap.forcePut("New IND", "India"); //This will override value's key

        biMap.entrySet().forEach(entry -> System.out.println("Key===" + entry.getKey()
               +  " Value = " + entry.getValue()));



    }
}


