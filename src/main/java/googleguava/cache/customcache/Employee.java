package googleguava.cache.customcache;

import lombok.Data;

import java.util.UUID;

@Data
public class Employee {
    private final UUID id;
    private final String name;
}
