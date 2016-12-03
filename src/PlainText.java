public class PlainText extends Token{
	String contents;
	
	public PlainText(String plaintext){
		this.contents = plaintext;
		System.out.println("plaintext");
	}
	
	@Override
	public void accept(MDElementVisitor v) {
		v.visitToken(this);
	}

}
