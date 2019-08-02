package googleguava.collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TableExample {

    Table<String, String, Integer> table = HashBasedTable.create();

    @Test
    public void testTable(){

        initTable();

        int seatInCSEForBeta = table.get("Beta", "CSE");
        assertThat(seatInCSEForBeta).isEqualTo(20);

        assertThat(table.get("Random", "Random"))
                .withFailMessage("Value should not be present")
                .isNull();

    }

    @Test
    public void testEntryPresence(){
        initTable();
        final boolean contains = table.contains("Alpha", "CSE");
        assertThat(contains).isTrue();

        final boolean abc = table.containsColumn("ABC");
        assertThat(abc).isFalse();

        final boolean cse = table.containsValue(20);
        assertThat(cse).isTrue();
    }

    private void initTable() {
        table.put("Alpha", "IT", 10);
        table.put("Alpha", "CSE", 20);
        table.put("Alpha", "ME", 30);
        table.put("Beta", "IT", 10);
        table.put("Beta", "CSE", 20);
        table.put("Beta", "ME", 30);
        table.put("Gamma", "IT", 10);
        table.put("Gamma", "CSE", 20);
        table.put("Gamma", "ME", 30);
    }
}
