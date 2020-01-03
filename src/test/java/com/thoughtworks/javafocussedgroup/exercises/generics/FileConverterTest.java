package com.thoughtworks.javafocussedgroup.exercises.generics;

import com.thoughtworks.javafocussedgroup.exercises.generics.FileConverter.NoConverterFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileConverterTest {

    private FileConverter fileConverter = new FileConverter();

    @Before
    public void setUp() {
        fileConverter.add(new HtmlToPdf());
        fileConverter.add(new PdfToText());
        fileConverter.add(new HtmlToWord());
        fileConverter.add(new WordToSheet());
        fileConverter.add(new SheetToPdf());
        fileConverter.add(new TextToWord());
    }

    @Test
    public void StraightConverterTest() {
        Pdf pdf = fileConverter.convert(new Html("One"), Pdf.class);
        Assert.assertEquals("One", pdf.data());
    }

    @Test
    public void TwoHopConverterTest() {
        Sheet sheet = fileConverter.convert(new Html("Two"), Sheet.class);
        Assert.assertEquals("Two", sheet.data());
    }

    @Test
    public void FourHopConverterTest() {
        Text text = fileConverter.convert(new Html("Three"), Text.class);
        Assert.assertEquals("Three", text.data());
    }

    @Test (expected = NoConverterFoundException.class)
    public void NoAvailableConverterTest() {
        Xml xml = fileConverter.convert(new Html("Four"), Xml.class);
    }
}