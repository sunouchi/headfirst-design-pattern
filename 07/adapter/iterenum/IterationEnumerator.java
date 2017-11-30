public class iteratorEnumeration implements Enumeration {
    Iterator iterator;

    public iteratorEnumeration(Iterator iterator){
        this.iterator = iterator;
    }

    public boolean hasMoreElement() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next()
    }
}
