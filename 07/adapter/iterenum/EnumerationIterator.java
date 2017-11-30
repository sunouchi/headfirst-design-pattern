public class EnumerationIterator implements Iterator {
    Enumaration enum;

    public EnumerationIterator(Enumaration enum) {
        this.enum = enum;
    }

    public boolean hasNext() {
        return enum.hasMoreElement();
    }

    public Object next() {
        return enum.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
