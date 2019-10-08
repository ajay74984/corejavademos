package effectivejavademos.singelton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;

public class ConnectionTest {
	
	@Test
	public void testSingleInstance() {
		Connection connection = Connection.getInstance();
		assertThat(connection).isNotNull();
	}
	
	@Test
	public void breakSingeltonViaReflection() throws IllegalAccessException, InvocationTargetException, InstantiationException {
		Connection instance1 = Connection.getInstance();
		Connection instance2 = null;
		for (Constructor constructor : Connection.class.getDeclaredConstructors()) {
			constructor.setAccessible(true);
			instance2 = (Connection) constructor.newInstance();
			
			break;
		}
		assertThat(instance1).isNotEqualTo(instance2);
	}
	
	@Test
	public void testEnumSingleton() {
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
		SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
		assertThat(singletonEnum).isEqualTo(singletonEnum1);
	}
}
