import java.util.*;

public class Document implements MDElement{
	public String inputname;
	public String outputname;
	protected ArrayList<Node> nodelist = new ArrayList<Node>();
	
	@Override
	public String accept(MDElementVisitor v) {
		// TODO Auto-generated method stub
		return v.visitDocument(this);
//		System.out.println("documentaccept");	
	}
	
	public Document(String input, String output){
		System.out.println("document created");
		this.inputname = input;
		this.outputname = output;
		
		//String nodecontents1 = "contentsofnode1";
		//String nodecontents2 = "contentsofnode2";
		//nodelist.add(new Header(1,nodecontents1));
	}
	
	public void addNode(Node node){
		System.out.println("add node function");
		nodelist.add(node);
	}
	
	

	public String getOutput(){
		return outputname;
	}

	public String getInput() {
		// TODO Auto-generated method stub
		return inputname;
	}

}
