package stats;

import javax.management.MalformedObjectNameException;

public class JmxConnectionTest {
	
	public static void main(String[] args) throws MalformedObjectNameException {
		DocStatistics fetchStat = DocStatistics.create(1024, 1000);
		DocStatistics delete = DocStatistics.create(2056, 2000);
		DocStatistics uploadStats = DocStatistics.create(102, 3000);
		DataStoreDocStatistics bean = DataStoreDocStatistics.with(fetchStat,
				delete, uploadStats);
		bean.publish();
		System.out.println("Published");
	}
}
