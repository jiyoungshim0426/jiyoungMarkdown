import java.util.Iterator;
import java.util.ArrayList;

public class Header extends Node{
	private int headersize;
	private String headercontents;
	
	public Header(int headersize, String headercontents) {
		this.headersize = headersize;
		this.headercontents = headercontents;
		//System.out.println("header node created");
	}
	
	public int getHeaderSize(){
		return this.headersize;
	}
	
	public String getHeaderContents(){
		return this.headercontents;
	}
	
	
	@Override
	public String accept(MDElementVisitor v) {
		// TODO Auto-generated method stub
		//System.out.println("visitheader");
		return v.visitHeader(this);
	}
	

}
