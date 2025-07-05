package ImplementingFactoryMethodPattern;

public interface Document {
	void open();
}

class ExcelDocument implements Document {

	public void open() 
	{
        System.out.println("Opening Excel Spreadsheet.");
    }

}
 
class WordDocument implements Document {

		public void open()
		{
			System.out.println("Opening Word Document.");
		}

}
 
class PdfDocument implements Document {

		public void open() 
		{
	        System.out.println("Opening PDF Document.");
	    }
}
