package com.lailai.pattern.IteratorPattern;

public class NameRepo implements Container {
    private String[] nameRepo={"john","mary","mark"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    public class NameIterator implements Iterator {
        int idx;

        @Override
        public boolean hasNext() {
            if (idx<nameRepo.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()){
                return  nameRepo[idx++];
            }
            return null;
        }
    }
}
