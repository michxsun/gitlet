
public class Commands {
	
	public Gitlet gitlet;
	
	public Commands(Gitlet g) {
		gitlet = g;
	}
	
	public static Gitlet init() {
		return new Gitlet();
	}
	
	public void add(String fileName) {
		
	}
	
	public void rm(String fileName) {
		
	}
	
	public void commit(String message) {
		
	}
	
	public void log() { // prints commits on a branch
		
	}
	
	public void global_log() {
		//prints all commits ever
	}
	
	public void  find(String message) { //print IDs
		
	}
	/**
	 * prints branches, current branch w/ *
	 * displays staged, and untracked files
	 */
	public void status() {
		
	}
	
	/**
	 * Switches branches
	 * @param arg
	 */
	public void checkout(String arg) {
		String[] args = arg.split(" ");
	}
	
	/**
	 * creates a new branch w/ a new name
	 * @param name
	 */
	public void branch(String name) {
		
	}
	
	/**
	 * deletes the pointer associated w/ branch
	 * does not mean to delete all commits
	 * @param name
	 */
	public void rm_branch(String name) {
		
	}
	
	public void reset(int id) {
		
	}
	
	public void merge(String name) {
		
	}
	
	public void rebase(String name) {
		
	}
	
	public void callCommand(String command, String args) {
		command = command.toLowerCase();
		if(command.equals("init")) 			init();
		else if(command.equals("add"))		add(args);
		else if(command.equals("rm"))		rm(args);
		else if(command.equals("commit"))	commit(args);
		else if(command.equals("log"))		log();
		else if(command.equals("global-log"))global_log();
		else if(command.equals("find"))		find(args);
		else if(command.equals("status"))	status();
		else if(command.equals("checkout"))	checkout(args);
		else if(command.equals("branch"))	branch(args);
		else if(command.equals("rm-branch"))rm_branch(args);
		else if(command.equals("reset"))	reset(Integer.parseInt(args));
		else if(command.equals("merge"))	merge(args);
		else if(command.equals("rebase"))	rebase(args);
		else System.out.println("Error");
		
		
		
	}
	
	

}
