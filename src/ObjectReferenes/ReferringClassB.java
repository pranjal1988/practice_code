package ObjectReferenes;

public class ReferringClassB {
	
	ReferredClassA classRefA;
	int referredIntVal;
	String referredStringVal;
	String referredName;
	
	public ReferringClassB(ReferredClassA c1, ReferredClassA c2){
		this.classRefA = c1;
		this.referredIntVal = c2.getRefIntVal();
		this.referredStringVal = c2.getRefStringVal();
		this.referredName = c2.getName();
	}

	/**
	 * @return the classRefA
	 */
	public ReferredClassA getClassRefA() {
		return classRefA;
	}

	/**
	 * @param classRefA the classRefA to set
	 */
	public void setClassRefA(ReferredClassA classRefA) {
		this.classRefA = classRefA;
	}

	/**
	 * @return the referredIntVal
	 */
	public int getReferredIntVal() {
		return referredIntVal;
	}

	/**
	 * @param referredIntVal the referredIntVal to set
	 */
	public void setReferredIntVal(int referredIntVal) {
		this.referredIntVal = referredIntVal;
	}

	/**
	 * @return the referredStringVal
	 */
	public String getReferredStringVal() {
		return referredStringVal;
	}

	/**
	 * @param referredStringVal the referredStringVal to set
	 */
	public void setReferredStringVal(String referredStringVal) {
		this.referredStringVal = referredStringVal;
	}

	/**
	 * @return the referredName
	 */
	public String getReferredName() {
		return referredName;
	}

	/**
	 * @param referredName the referredName to set
	 */
	public void setReferredName(String referredName) {
		this.referredName = referredName;
	}
	
}
