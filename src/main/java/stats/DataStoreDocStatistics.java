package stats;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import java.util.Objects;

public class DataStoreDocStatistics implements DataStoreDocStatisticsMBean {
	
	private static final String JMX_BINDING_NAME = "stats:type=bean";
	
	private DocStatistics docFetchStatistics;
	private DocStatistics docUploadStatistics;
	private DocStatistics docDeleteStatistics;
	private JmxConnection jmxConnection;
	private ObjectName objectName;
	
	private DataStoreDocStatistics(
			DocStatistics docFetchStatistics, DocStatistics docRetrieveStatistics,
			DocStatistics docDeleteStatistics) {
		this.docFetchStatistics = Objects.requireNonNull(docFetchStatistics);
		this.docUploadStatistics = Objects.requireNonNull(docRetrieveStatistics);
		this.docDeleteStatistics = Objects.requireNonNull(docDeleteStatistics);
		jmxConnection = new JmxConnection();
		objectName = getObjectName();
	}
	
	public static DataStoreDocStatistics with(
			DocStatistics docFetchStatistics, DocStatistics docRetrieveStatistics,
			DocStatistics docDeleteStatistics) {
		return new DataStoreDocStatistics(docFetchStatistics, docRetrieveStatistics, docDeleteStatistics);
	}
	
	@Override
	public DocStatistics getDocFetchStatistics() {
		return docFetchStatistics;
	}
	
	public void setDocFetchStatistics(DocStatistics docFetchStatistics) {
		this.docFetchStatistics = docFetchStatistics;
	}
	
	@Override
	public DocStatistics getDocUploadStatistics() {
		return docUploadStatistics;
	}
	
	public void setDocUploadStatistics(DocStatistics docUploadStatistics) {
		this.docUploadStatistics = docUploadStatistics;
	}
	
	@Override
	public DocStatistics getDocDeleteStatistics() {
		return docDeleteStatistics;
	}
	
	public void setDocDeleteStatistics(DocStatistics docDeleteStatistics) {
		this.docDeleteStatistics = docDeleteStatistics;
	}
	
	public ObjectName getObjectName() {
		ObjectName objectName = null;
		try {
			objectName = new ObjectName(JMX_BINDING_NAME);
		} catch (MalformedObjectNameException e) {
			e.printStackTrace();
		}
		return objectName;
	}
	
	
	/**
	 * Publish this test-info-bean if not published.
	 */
	public void publish() throws MalformedObjectNameException {
		try {
			MBeanServer beanServer = jmxConnection.getBeanServer();
			if (!beanServer.isRegistered(objectName)) {
				beanServer.registerMBean(this, objectName);
			}
		} catch (JMException | RuntimeException ex) {
			System.out.println("Could not publish test-info-bean: {}" + objectName.toString() + ex);
		}
	}
	
	/**
	 * Unpublish this test-info-bean if published.
	 */
	public void unpublish() {
		try {
			MBeanServer beanServer = jmxConnection.getBeanServer();
			if (beanServer.isRegistered(objectName)) {
				beanServer.unregisterMBean(objectName);
			}
		} catch (JMException | RuntimeException ex) {
			System.out.println("Could not unpublish test-info-bean: {}" + objectName.toString() + ex);
		}
	}
	
	public void printStats() {
		System.out.println("DataStoreDocStatistics{" +
				                   "docFetchStatistics=" + docFetchStatistics +
				                   ", docUploadStatistics=" + docUploadStatistics +
				                   ", docDeleteStatistics=" + docDeleteStatistics +
				                   '}');
	}
}
