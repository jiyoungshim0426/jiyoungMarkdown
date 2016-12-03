import java.util.*;

public class Document implements MDElement{
	public String inputname;
	public String outputname;
	protected ArrayList<Node> nodelist = new ArrayList<Node>();
	
	@Override
	public void accept(MDElementVisitor v) {
		// TODO Auto-generated method stub
		for(int i=0;i<nodelist.size();i++){
			nodelist.get(i).accept(v);
		}
		System.out.println("documentaccept");
		v.visitDocument(this);
	}
	
	public Document(String input, String output){
		System.out.println("document created");
		this.inputname = input;
		this.outputname = output;
		
		String nodecontents1 = "contentsofnode1";
		String nodecontents2 = "contentsofnode2";
		
		nodelist.add(new Header(1,nodecontents1));
	}
	

	public String getOutput(){
		return outputname;
	}

	public String getInput() {
		// TODO Auto-generated method stub
		return inputname;
	}

}
