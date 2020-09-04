public class GenericHolder<T> {
    
    private T storage;
    
    public T get() {
        // check for oops
        if(storage == null) {
            throw new IllegalStateException("Nothing here.");
        }
        // normal processing
        T temp = storage;
        storage = null;
        return temp;
    }
    
    public void set(T s) {
        // checking for an error condition
        if(storage != null) {
            throw new IllegalStateException("No,no,no. Already in use.");
        }
        // normal processing
        storage = s;
    }
    
    public GenericHolder() {
        storage = null;
    }
    
    public GenericHolder(T stuff) {
        storage = stuff;
    }
    
    public boolean hasValue() {
        return storage != null;
    }
    
}