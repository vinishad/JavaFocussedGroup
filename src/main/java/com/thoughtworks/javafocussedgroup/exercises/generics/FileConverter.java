package com.thoughtworks.javafocussedgroup.exercises.generics;

/*
 * TODO: Implement this class
 */
public class FileConverter {

    /*
     * TODO: Implement logic to add the passed in converter and store it
     */
    public void add(Converter converter) {

    }

    /*
     * TODO: Implement logic to iterate through the available converters and convert the given file
     * either using a straight converter / passing through multiple converters
     */
    public <T extends File, U extends File> U convert(T from, Class<U> clazz) {
        return null;
    }

    /*
     * TODO: Throw this exception when no Converters for the given input / output combination are available
     */
    public static class NoConverterFoundException extends RuntimeException {}

}
