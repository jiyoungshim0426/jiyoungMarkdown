import java.util.ArrayList;

public abstract class Token implements MDElement{
	protected ArrayList<Token> innertokenlist = new ArrayList<Token>();
	protected String result;
	
	public abstract String accept(MDElementVisitor v);

}
