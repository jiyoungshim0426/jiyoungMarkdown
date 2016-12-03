
public class PlainVisitor implements MDElementVisitor{

	@Override
	public void visitDocument(Document d) {
		// TODO Auto-generated method stub
		String html;
		html = "<html>";
		html += "<head>" + d.getInput() + " to "+ d.getOutput() + "</head>";
		html += "<body>";
		System.out.println(html);

	}

	@Override
	public void visitNode(Node n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitToken(Token t) {
		// TODO Auto-generated method stub
		
	}

}
