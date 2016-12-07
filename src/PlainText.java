public class PlainText extends Token{
	String contents;
	
	public PlainText(String plaintext){
		this.contents = plaintext;
		System.out.println("plaintext created");
	}
	
	@Override
	public String accept(MDElementVisitor v) {
		return v.visitToken(this);
	}
	
}
