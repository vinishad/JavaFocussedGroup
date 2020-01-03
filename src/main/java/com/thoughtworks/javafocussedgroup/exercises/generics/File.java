package com.thoughtworks.javafocussedgroup.exercises.generics;

public class File {

    private String data;

    public File(String data) {
        this.data = data;
    }

    public String data() {
        return data;
    }

}

class Html extends File {

    public Html(String data) {
        super(data);
    }

}

class Pdf extends File {

    public Pdf(String data) {
        super(data);
    }

}

class Text extends File {

    public Text(String data) {
        super(data);
    }

}

class Word extends File {

    public Word(String data) {
        super(data);
    }

}

class Sheet extends File {

    public Sheet(String data) {
        super(data);
    }

}

class Xml extends File {

    public Xml(String data) {
        super(data);
    }

}
