package John;

class GenClass<T extends Comparable<T>> implements GenInter<T> {
    T[] vals;
    GenClass(T[] o) {
        vals = o;
    }
    public T min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }
}