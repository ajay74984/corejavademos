package stats;

import javax.management.MXBean;

@MXBean
public interface DataStoreDocStatisticsMBean {
	/**
	 * @return the statistics of document(s) fetch operation
	 */
	DocStatistics getDocFetchStatistics();
	
	/**
	 * @return the statistics of document(s) upload operation
	 */
	DocStatistics getDocUploadStatistics();
	
	/**
	 * @return the statistics of document(s) delete operation
	 */
	DocStatistics getDocDeleteStatistics();
}
