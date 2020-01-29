package stats;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.Objects;

public class JmxConnection {
	
	// The connection with the (local or remote) JMX-server.
	private final MBeanServer beanServer;
	
	public JmxConnection() {
		this.beanServer = ManagementFactory.getPlatformMBeanServer();
	}
	
	/**
	 * Returns the mbean-server-connection for this JMX-connection.
	 */
	public MBeanServer getBeanServer() {
		return beanServer;
	}
	
	/**
	 * Returns the total number of JMX-objects available.
	 */
	public int getObjectCount() throws IOException {
		return beanServer.getMBeanCount();
	}
	
	/**
	 * Returns whether a JMX-object with the specified name exists.
	 */
	public boolean hasObject(ObjectName objectName) throws IOException {
		Objects.requireNonNull(objectName);
		return beanServer.isRegistered(objectName);
	}
	
}
