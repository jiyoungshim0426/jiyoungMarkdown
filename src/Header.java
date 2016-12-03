import java.util.Iterator;
import java.util.ArrayList;

public class Header extends Node{
	private int headersize;
	protected ArrayList<Token> tokenlist = new ArrayList<Token>();
	private String headercontents;
	
	public Header(int headersize, String headercontents) {
		this.headersize = headersize;
		this.headercontents = headercontents;
		tokenlist.add(new PlainText(headercontents));
		tokenlist.add(new PlainText("plain2222"));
		System.out.println("headernodecreated");
	}
	
	
	@Override
	public void accept(MDElementVisitor v) {
		// TODO Auto-generated method stub
		System.out.println("visitheader");
		
		for(int i=0;i<tokenlist.size();i++){
			tokenlist.get(i).accept(v);
		}
		v.visitNode(this);
	}
	

}
