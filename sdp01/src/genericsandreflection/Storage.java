package genericsandreflection;

public class Storage<T> {
	T x;

	public void setValue(T value) {
		x = value;
	}

	public T getValue() {
		return x;
	}

}