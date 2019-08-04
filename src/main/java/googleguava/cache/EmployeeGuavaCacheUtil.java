package googleguava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public class EmployeeGuavaCacheUtil {

    private static LoadingCache<Integer, Employee> loadingCache;

        static {
            loadingCache = CacheBuilder
                    .newBuilder()
                    .maximumSize(100)
                    .recordStats()
                    .refreshAfterWrite(10, TimeUnit.MINUTES)
                    .expireAfterWrite(10, TimeUnit.MINUTES)
                    .build(
                            new CacheLoader<Integer, Employee>() {
                                @Override
                                public Employee load(Integer key) {
                                    return getEmployeeById(key);
                                }
                            }
                    );
        }


    public static Employee getEmployeeById(int id) {
        System.out.println("--Executing getEmployeeById--");
        //Perform any expensive task like fetching data from Database.
        //For the demo we are performing a simple task
        Employee emp1 = new Employee(1, "Ramesh");
        Employee emp2 = new Employee(2, "Mohan");
        if(id == 1 ) {
            return emp1;
        } else {
            return emp2;
        }
    }

    public static LoadingCache<Integer, Employee> getLoadingCache() {
        return loadingCache;
    }

}
