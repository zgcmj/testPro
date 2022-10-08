package collection;

public class Wildcard<T> {
    private T name;
    private T fun;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getFun() {
        return fun;
    }

    public void setFun(T fun) {
        this.fun = fun;
    }
}
