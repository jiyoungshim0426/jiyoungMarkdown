import java.io.*;
import java.util.*;

public class MDParser {
	public static void main(String args[]){
		try{
			Document document1 = new Document("sample.md","result.md");
			document1.accept(new PlainVisitor());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
