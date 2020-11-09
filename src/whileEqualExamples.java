public class whileEqualExamples {

    public static void main(String[] args) {

  /** 1st way with while loop optimized */
        int count=1;
        while (count!=6){
            System.out.println("Number is "+count);
            count++;    //careful about incrementing the count or endless loop
        }
        System.out.println("**************");

  /** 2nd way with while loop */
        count=1;
        while (true){
            if (count==6){
               break;
            }
            System.out.println("Number is "+count);
            count++;    //careful about incrementing the count or endless loop
        }
        System.out.println("**************");

/** 3rd way with do_while loop, keep in mind do_while will always be executed at least one time before stop or loop */
        count=1;
        do{
            System.out.println("Number is "+count);
            count++;    //careful about incrementing the count or endless loop
        }while (count!=6);

        System.out.println("**************");

  /** 4th way with for loop */
        for (count=1; count<6; count++){
            System.out.println("Number is "+count);
        }     // no incrementing the count in for loop because it's already incremented (line 25, count++)
    }
}
