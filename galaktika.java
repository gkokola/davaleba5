package davaleba5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("-------------------------შექმენით თქვენი ვარსკვლავი-------------------------");
        System.out.println("თანმიმდევრობით შემოიტანეთ მონაცემები");

        System.out.print("შემოიტანეთ სახელი: ");
        Scanner Name = new Scanner(System.in);
        String name = Name.nextLine();

        System.out.print("შემოიტანეთ დიამეტრი: ");
        Scanner Diameter = new Scanner(System.in);
        int diameter = Diameter.nextInt();

        System.out.print("შემოიტანეთ ტემპერატურა: ");
        Scanner Temperature = new Scanner(System.in);
        int temperature = Temperature.nextInt();

        System.out.println("-------------------------შექმენით თქვენი პლანეტა-------------------------");
        System.out.println("თანმიმდევრობით შემოიტანეთ მონაცემები");

        System.out.print("შემოიტანეთ პლანეტის სახელი: ");
        Scanner PlanetName = new Scanner(System.in);
        String planetName = PlanetName.nextLine();

        System.out.print("შემოიტანეთ ვარსკვლავის სახელი სახელი: ");
        Scanner Starname = new Scanner(System.in);
        String starname = Starname.nextLine();

        System.out.print("რა მანძილითაა დაშორებული ვარსკვლავისგან?: ");
        Scanner Distance = new Scanner(System.in);
        String distance = Distance.nextLine();

        System.out.print("რა სიჩქარით გადაადგილდება სივრცეში? : ");
        Scanner Speed = new Scanner(System.in);
        String speed = Speed.nextLine();

        System.out.print("თუ გსურთ პლანეტის თვისებების ნახვა შემოიტანეთ მისი სახელი: ");
        Scanner Info = new Scanner(System.in);
        String info = Info.nextLine();

        int around = Integer.parseInt(distance) / Integer.parseInt(speed);
        for(int i=0; ; i++) {
            if (PlanetName.equals(PlanetName)) {
                System.out.println("ვარსკვლავის გარშემო გადაადგილდება ამ დროის ერთეულში : " + around);
            }
            break;
        }

        System.out.print("თუ გსურთ გალაქტიკის დათვალიერება შემოიტანეთ 1: ");
        Scanner Galaxy = new Scanner(System.in);
        String galaxy = Galaxy.nextLine();
        int galaxyToInt = Integer.parseInt(galaxy);
        if(galaxyToInt==1){
            System.out.println("ვარსკვლავი - "+name +"  " +  "ტრიალებს" + " " + planetName +  "-ს გარშემო");
            return;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("Galaxy.txt", true));
        writer.write(name);
        writer.write(diameter);
        writer.write(temperature);
        writer.write(planetName);
        writer.write(distance);
        writer.write(speed);
        writer.write(around);
        writer.close();

    }
}