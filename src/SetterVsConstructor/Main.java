package SetterVsConstructor;


public class Main {

    public static void main(String[] args) {

        //Constructor initializes the objects
      Constructor demo1 = new Constructor("Porche","Carrera");
      demo1.display();

      Constructor demo2 = new Constructor("Toyota","Carina");
      demo2.display();

      Constructor demo3 = new Constructor("Seat","Leon");
      demo3.display();


        //Setter changes the values of the object and validates
      Setter demo = new Setter();

      demo.setModel("Porche" ,"Cayenne");
      demo.setModel("Huyndai" ,"Getz");
      demo.setModel("Seat" ,"Avensis");

        demo.display();
    }


}
