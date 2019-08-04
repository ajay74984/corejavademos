package googleguava.cache;

import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

public class CacheDemo {

        public static void main(String[] args) {
            CacheDemo cacheDemo = new CacheDemo();
            try {
                //Access employee first time with id 1, getEmployeeById() will be called.
                System.out.println(cacheDemo.getEmpUsingGuava(1).getName());
                System.out.println("------------------------");
                //Access employee second time with id 1, getEmployeeById() will be not called.
                //Data is cached.
                System.out.println(cacheDemo.getEmpUsingGuava(1).getName());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        private Employee getEmpUsingGuava(int id) throws ExecutionException {
            LoadingCache<Integer, Employee> empCache = EmployeeGuavaCacheUtil.getLoadingCache();
            //System.out.println(empCache.stats());
            System.out.println("Cache Size:" + empCache.size());
            return empCache.get(id);
        }
    }

