package SetterVsConstructor;

public class Setter {

    private String brandName;
    private String model;

    public void setModel(String brandName, String model){
        this.brandName=brandName;
        this.model=model;
    }
    public void display(){
        System.out.println("The brandName is: " + brandName + " The model is: " + model + "\n");
    }
}
