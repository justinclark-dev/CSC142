public class StringHolder {
    
    private String storage;

    public String get() {
        // check for oops
        if(storage == null) {
            throw new IllegalStateException("Nothing here.");
        }
        // normal processing
        String temp = storage;
        storage = null;
        return temp;
    }
    
    public void set(String s) {
        // checking for an error condition
        if(storage != null) {
            throw new IllegalStateException("No,no,no. Already in use.");
        }
        // normal processing
        storage = s;
    }
    
    public StringHolder() {
        storage = null;
    }
    
    public StringHolder(String stuff) {
        storage = stuff;
    }
    
    public boolean hasValue() {
        return storage != null;
    }
    
}