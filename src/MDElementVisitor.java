
public interface MDElementVisitor {
	public abstract void visitDocument(Document d);
	public abstract void visitNode(Node n);
	public abstract void visitToken(Token t);
}
