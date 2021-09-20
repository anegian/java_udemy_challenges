package SetterVsConstructor;

public class Constructor{

    private final String brandName;
    private final String model;

    public Constructor (String brandName, String model) {
        this.brandName = brandName;
        this.model = model;
    }
    public void display(){
        System.out.println("The brandName is: " + brandName + " The model is: " + model + "\n");
    }
}