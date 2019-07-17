import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
    List <car> carlist = new ArrayList<>();
    car carIniT = new car();

    Scanner sc = new Scanner(System.in);
    public void addCar()
    {
        // System.out.println("how many cars you want to enter");
        //int total= sc.nextInt();
        //for(int i=0;i<total;i++)
        //{
        car c = new car();
        Validation v=new Validation();
        String s="";
        int n=0;
        do{
            System.out.println("Enter the make");
             s=sc.next();
            c.setMake(s);
        } while(v.isNumber(s)==true);

        do{
            System.out.println("Enter the model");
            s=sc.next();
            c.setModel(s);
        }while(v.isNumber(s)==true);

        do{
            System.out.println("Enter the year");
            s= sc.next();
            n = Integer.parseInt(s);
            c.setYear(n);
        }while(v.isNumber(s)==false);

        do{
            System.out.println("Enter the color");
            s= sc.next();
            c.setColor(s);
        }while(v.isNumber(s)==true);

        do{
            System.out.println("Enter the miles on Odometer");
            s= sc.next();
            n = Integer.parseInt(s);
            c.setMiles(n);
        }while(v.isNumber(s)==false);
        carlist.add(c);


    }
    //}

    public void viewCar() {
        System.out.println("1. Search by Make"+"\n"+"2. Search by Model"+"\n"+"3. Search by Year"+"\n"+"4. Search by Color"+"\n"+"5. Search by <than 50k miles"+"\n"+"6. Search by ALL");
        int search =sc.nextInt();
        List<car> cars = new ArrayList();
        String make = "";
        String model = "";
        int year = 0;
        String color = "";
        String all = "";
        int miles = 0;
        switch (search) {
            case 1:
                System.out.println("Enter the value to search Car by MAKE");
                make = sc.next();
                break;
            case 2:
                System.out.println("Enter the value to search Car by MODEL");
                model = sc.next();
                break;
            case 3:
                System.out.println("Enter the value to search Car by YEAR");
                year = Integer.parseInt(sc.next());
                break;
            case 4:
                System.out.println("Enter the value to search Car by COLOR");
                color = sc.next();
                break;
            case 5:
                System.out.println("Enter the value to search Car by MILES");
                miles = Integer.parseInt(sc.next());
                break;
            case 6 :
                all = "dsds";
                break;
        }

        for(car c:carlist)
        {
            if(!make.isEmpty() && c.getMake().equals(make)){
                cars.add(c);
            }
            if(!model.isEmpty() && c.getModel().equals(model)){
                cars.add(c);
            }
            if( c.getYear()==year){
                cars.add(c);
            }
            if(!color.isEmpty() && c.getColor().equals(color)){
                cars.add(c);
            }
            if(miles>50 ) {
                cars.add(c);
            }
            if(!all.isEmpty()){
                cars.add(c);
            }


        }
        System.out.println("MAKE  \t MODEL \t YEAR \t COLOR \t MILES  ");
        for(car c:cars){
            System.out.println(c.getMake()+"\t"+c.getModel()+"\t"+c.getYear()+"\t"+c.getColor()+"\t"+c.getMiles());
        }


    }

    public void deleteCar()
    {
        System.out.println("Enter the make you want to delete ");
        String make = sc.next();
        List<car> aa = new ArrayList();
        for(car c:carlist){
            if(!c.getMake().equalsIgnoreCase(make)){
                aa.add(c);

            }
        }
        carlist.clear();
        carlist.addAll(aa);
        //carlist.clear(sc.next());
    }
}