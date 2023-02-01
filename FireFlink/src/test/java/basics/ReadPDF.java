package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ReadPDF {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
BodyContentHandler contenthandler=new BodyContentHandler();

FileInputStream fis=new FileInputStream("./src/test/resources/testdata/Lakshmi Narayana Reddy M R Resume.pdf");
Metadata metadata=new Metadata();
ParseContext parsecontext=new ParseContext();
PDFParser parser=new PDFParser();
parser.parse(fis, contenthandler, metadata, parsecontext);

System.out.println(contenthandler.toString());
	}

}