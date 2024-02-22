public abstract class CacheAny<T> {
public T t;

public abstract void display(T t);
public abstract T calculate(T t, T x);

//Override
// public Integer calculate(Integer a, Integer b)

// Misal ini Override
// public void display()

public T get() {
    return t;
}

public void set(T t) {
    this.t = t;
}

@Override
public String toString() {
    return "CacheAny [t=" + t + "]";
}


    
}
