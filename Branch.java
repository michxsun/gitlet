
public class Branch { // java representation of git branch.
	
	public Commit commit;
	public String name;
	//add myNext, myPrev if appropriate
	
	/**
	 * Creates a new branch
	 * @param name - name of the branch
	 */
	public Branch(String name) {
		this.name = name;
	}
	
	

}
