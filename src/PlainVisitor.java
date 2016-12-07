public class PlainVisitor implements MDElementVisitor{
	
	@Override
	public String visitDocument(Document d) {
		// TODO Auto-generated method stub
		String html = "";
		html = "<html>";
		html += "<head>" + d.getInput() + " to "+ d.getOutput() + "</head>";
		html += "<body>";
		
		for(int i=0;i<d.nodelist.size();i++){
			html += d.nodelist.get(i).accept(this);
			System.out.println(i+": "+html);
		}
		
		//System.out.println(html);
		
		System.out.println("all node visited");
		System.out.println("visit document finished");
		html+="</body></html>";
		return html;
	}


	@Override
	public String visitNode(Node n) {
		// TODO Auto-generated method stub
		//System.out.println("node visited");
		String html="";
		for(int i=0;i<n.tokenlist.size();i++){
			html+=n.tokenlist.get(i).accept(this);
		}
		return html;
	}
	
	public String visitHeader(Header h){
		System.out.println("header visited");
		String headerhtml = "<H"+h.getHeaderSize()+">";
		for(int i=0;i<h.tokenlist.size();i++){
			headerhtml += h.tokenlist.get(i).accept(this);
		}
		headerhtml += "</H"+h.getHeaderSize()+">";
		//System.out.println(headerhtml)
		
		return headerhtml;
	}

	@Override
	public String visitToken(PlainText plainText) {
		// TODO Auto-generated method stub
		return plainText.contents;
	}



}
