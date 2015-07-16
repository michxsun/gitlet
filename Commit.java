
public class Commit {
	
	//TODO add instance variables
	public int id;
	public Commit parent;
	public Commit child; //we'll see
	public List<File> staged;
	
	private List<String> unmodifiedFiles, modifiedFiles; // should the staged be here or the Gitlet
	
	/**
	 * @param message attached to commit
	 */
	//TODO constructor
	public Commit() {
		
	}

}