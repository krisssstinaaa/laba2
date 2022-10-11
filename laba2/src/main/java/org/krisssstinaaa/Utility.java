package org.krisssstinaaa;

public class Utility {
    @SuppressWarnings("unchecked")
    public static <F extends Number, S extends Number> S castNumberToGeneric(Class<F> f, Number number) {
        if (f.equals(Byte.class)) return (S) f.cast(number.byteValue());
        else if (f.equals(Double.class)) return (S) f.cast(number.doubleValue());
        else if (f.equals(Float.class)) return (S) f.cast(number.floatValue());
        else if (f.equals(Integer.class)) return (S) f.cast(number.intValue());
        else if (f.equals(Long.class)) return (S) f.cast(number.longValue());
        else if (f.equals(Short.class)) return (S) f.cast(number.shortValue());
        else throw new IllegalArgumentException();
    }
}