package org.krisssstinaaa.Exceptions;
//Custom error, which helps us identify the misapplication of the method (for example, multiplication on immutable matrix)
public class WrongMethodUse extends Exception {
    public WrongMethodUse() {
        super("Cannot use method with matrix");
    }
}
