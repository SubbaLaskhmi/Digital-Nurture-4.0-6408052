package ImplementingFactoryMethodPattern;

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() 
    {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() 
    {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() 
    {
        return new ExcelDocument();
    }
}
