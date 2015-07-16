// add import here
// add import here
import java.util.*;

public class Gitlet {
	
	//instance variable
	public ArrayList<Branch> branches; //Array of branches. Add Array class
	public Branch current; //branch where Head pointer is currently on
	public static int commitID; //unique int id for commits
	public Commit nextCom;
	private Commands commandHandler;
	
	
		
		/** test 
		 *  @param x some x value
		 */
	public void test (int x){ // scrap this later
		
	}
	
	public Gitlet() { // constructor
		
	}
	
	public static void main(String[] args) {
		
		Gitlet g = new Gitlet(); // serializable
		
		String command = args[0];
		
		String arg = "";
		for(int i = 1; i < args.length; i++) {
			arg += args[i] + " ";
		}
		arg = arg.substring(0, arg.length() - 1);
		g.getCommands().callCommand(command, arg);
		
		
	}
	
	public Commands getCommands() {
		return commandHandler;
	}

}
