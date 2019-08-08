package java8.datetimeapi;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTimeExamples {

    @Test
    void testZonedTime(){
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        System.out.println(zoneId);
    }
}
