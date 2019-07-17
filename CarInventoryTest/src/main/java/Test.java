import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Operations op=new Operations();
        Scanner sc= new Scanner(System.in);
        while (true)
        {
            System.out.println("1. Add car to inventory"+"\n"+"2. Delete car from inventory"+"\n"+"3. View entire inventory"+"\n");
            System.out.println("Enter a selection.");
            //try block
            int Ch=sc.nextInt();
            switch (Ch)
            {
                case 1:
                    op.addCar();
                    break;

                case 2:
                    op.deleteCar();
                    break;
                case 3:
                    op.viewCar();
                    break;

            }

        }
    }
}