
public interface MDElementVisitor {
	public abstract String visitDocument(Document d);
	public abstract String visitNode(Node n);
	public abstract String visitHeader(Header h);
	public abstract String visitToken(PlainText plainText);
}
