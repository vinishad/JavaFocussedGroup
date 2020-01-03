package com.thoughtworks.javafocussedgroup.exercises.generics;

public interface Converter<U extends File, V extends File> {
    Class from();
    Class to();
    V convert(U t);
}

class HtmlToPdf implements Converter<Html, Pdf> {

    public Class from() {
        return Html.class;
    }

    public Class to() {
        return Pdf.class;
    }

    public Pdf convert(Html html) {
        System.out.println("Converting from Html to Pdf");
        return new Pdf(html.data());
    }

}

class HtmlToWord implements Converter<Html, Word> {

    public Class from() {
        return Html.class;
    }

    public Class to() {
        return Word.class;
    }

    public Word convert(Html html) {
        System.out.println("Converting from Html to Word");
        return new Word(html.data());
    }

}

class WordToSheet implements Converter<Word, Sheet> {

    public Class from() {
        return Word.class;
    }

    public Class to() {
        return Sheet.class;
    }

    public Sheet convert(Word word) {
        System.out.println("Converting from Word to Sheet");
        return new Sheet(word.data());
    }

}

class PdfToText implements Converter<Pdf, Text> {

    public Class from() {
        return Pdf.class;
    }

    public Class to() {
        return Text.class;
    }

    public Text convert(Pdf pdf) {
        System.out.println("Converting from Pdf to Text");
        return new Text(pdf.data());
    }

}

class SheetToPdf implements Converter<Sheet, Pdf> {

    public Class from() {
        return Sheet.class;
    }

    public Class to() {
        return Pdf.class;
    }

    public Pdf convert(Sheet sheet) {
        System.out.println("Converting from Sheet to Pdf");
        return new Pdf(sheet.data());
    }

}

class TextToWord implements Converter<Text, Word> {

    public Class from() {
        return Text.class;
    }

    public Class to() {
        return Word.class;
    }

    public Word convert(Text text) {
        System.out.println("Converting from Text to Word");
        return new Word(text.data());
    }

}