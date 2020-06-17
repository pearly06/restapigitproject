package collectionPackage;

import java.util.Objects;

public class customer {
	
	private long id;
	private String name;
	public customer(long id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getID() {
		return id;
	}
	public void setID(long ID) {
		this.id = ID;
	}
	public String getname() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	
	// Two customers are equal if their IDs are equal
	
	public boolean equals(Object o) {
		if(this == o) return true;
		 if (o == null || getClass() != o.getClass()) return false;
		 customer Customer = (customer) o;
		 return id == Customer.id;
	}
	
	@Override
	
    public int hashCode() {
        return Objects.hash(id);
    }
	
	 @Override
	    public String toString() {
		 return "Customer{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                '}';
	 }
	 }


