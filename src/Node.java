import java.util.Iterator;
import java.util.ArrayList;

public abstract class Node implements MDElement{
	protected ArrayList<Node> innernodelist = new ArrayList<Node>();
	protected ArrayList<Token> tokenlist = new ArrayList<Token>();

	public static void create(String contents){
		;
	}
	
	
	public void addToken(Token token){
		System.out.println("add token function");
		tokenlist.add(token);
	}
	
}
