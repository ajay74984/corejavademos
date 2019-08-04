package googleguava.cache.customcache;

import org.apache.commons.collections4.map.LRUMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeCache implements Cache<Integer, Employee> {

    //LRUMap

    Map<Integer, Employee> employeeMap = new ConcurrentHashMap<>();

    @Override
    public Employee get(Integer key) {
        return employeeMap.get(key);
    }

    @Override
    public void put(Integer key, Employee value, long timeInMiliSeconds) {

    }

    @Override
    public void clear() {
        employeeMap.clear();
    }

    @Override
    public void remove(Integer key) {

    }

    @Override
    public long size() {
        return employeeMap.size();
    }
}
