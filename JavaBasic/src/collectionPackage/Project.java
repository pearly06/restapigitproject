package collectionPackage;

public class Project {
	
	String string ;
	String string2;
	int i;

	public Project(int i, String string, String string2) {
		super();
		this.i = i;
		this.string = string;
		this.string2 = string2;
		
	}
	
	 @Override
	    public String toString() {
	        // TODO Auto-generated method stub
	        return "[project id : " + this.i + ", project name : "
	                + this.string + ", project desc : " + this.string2 + " ]";
	    }

}
