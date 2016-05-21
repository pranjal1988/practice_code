package ObjectReferenes;

public class ReferredClassA {
	
	String name;
	int refIntVal;
	String refStringVal;
	
	public ReferredClassA(int refIntVal, String refStringVal, String name) {
		this.refIntVal = refIntVal;
		this.refStringVal = refStringVal;
		this.name = name;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the refIntVal
	 */
	public int getRefIntVal() {
		return refIntVal;
	}


	/**
	 * @param refIntVal the refIntVal to set
	 */
	public void setRefIntVal(int refIntVal) {
		this.refIntVal = refIntVal;
	}


	/**
	 * @return the refStringVal
	 */
	public String getRefStringVal() {
		return refStringVal;
	}


	/**
	 * @param refStringVal the refStringVal to set
	 */
	public void setRefStringVal(String refStringVal) {
		this.refStringVal = refStringVal;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ref class (" + name+ ") [int : " + refIntVal + "] , [string : " + refStringVal+"]";
	}
	
	

}
