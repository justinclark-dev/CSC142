public class ObjectHolder {

    private Object storage;
    
    public Object get() {
        // check for oops
        if(storage == null) {
            throw new IllegalStateException("Nothing here.");
        }
        // normal processing
        Object temp = storage;
        storage = null;
        return temp;
    }
    
    public void set(Object s) {
        // checking for an error condition
        if(storage != null) {
            throw new IllegalStateException("No,no,no. Already in use.");
        }
        // normal processing
        storage = s;
    }
    
    public ObjectHolder() {
        storage = null;
    }
    
    public ObjectHolder(Object stuff) {
        storage = stuff;
    }
    
    public boolean hasValue() {
        return storage != null;
    }
    
}