package SCJP_C2_ObjectOrientation;

public class TestEqualClass{
    
    private int equalConfirmingValue;
    private String instanceName;
    
    public void setEqualConfirmingValue(int val){
        this.equalConfirmingValue = val;
    }
    public int getEqualConfirmingValue(){
        return this.equalConfirmingValue;
    }
    public void setInstanceName(String name){
        this.instanceName = name;
    }
    public String getInstanceName(){
        return this.instanceName;
    }
    
    public boolean equals(Object o){
        System.out.println("overridden equal called:- ");
        if((o instanceof TestEqualClass) && 
        (((TestEqualClass)o).getEqualConfirmingValue() == this.getEqualConfirmingValue())){
            return true;
        }
        return false;
    }
    
    public boolean equals(TestEqualClass o){
        System.out.println("overloaded equal called:- ");
        if((o instanceof TestEqualClass) && 
        (((TestEqualClass)o).getEqualConfirmingValue() == this.getEqualConfirmingValue())){
            return true;
        }
        return false;
    }
}
