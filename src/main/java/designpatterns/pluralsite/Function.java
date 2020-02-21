package designpatterns.pluralsite;

@FunctionalInterface
public interface Function<T, R> {
	R apply(T t);
	
	default <V> Function<T, V> andThen(Function<R, V> f) {
		return (T t) -> {
			R r = this.apply(t);
			return f.apply(r);
		};
	}
	
}
