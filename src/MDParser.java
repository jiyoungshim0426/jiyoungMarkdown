import java.io.*;
import java.util.*;

public class MDParser {
	public static void main(String args[]){
		try{
			
			//randomly made tree after parsing
			Document document1 = new Document("sample.md","result.md");
			PlainText t1 = new PlainText("plain1");
			PlainText t2 = new PlainText("plain2");
			PlainText t3 = new PlainText("plain3");
			Header h1 = new Header(1,"header1");
			Header h2 = new Header(2,"header2");
			document1.addNode(h1);
			document1.addNode(h2);
			h1.addToken(t1);
			h1.addToken(t2);
			h2.addToken(t3);
			
			System.out.println("all created");
			System.out.println();
			String finalhtml ="";
			
			//accept + visit tree
			finalhtml = document1.accept(new PlainVisitor());
			
			//print to see if it's working
			System.out.println(finalhtml);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
