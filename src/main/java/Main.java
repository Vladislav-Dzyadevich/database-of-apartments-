import java.util.List;
import java.util.Scanner;

public class Main {
    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/flats?serverTimezone=Europe/Kiev";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "Vlad19191990";

    public static void main(String[] args) {
        ConnectionFactory f = new ConnectionFactory(
                DB_CONNECTION, DB_USER, DB_PASSWORD
        );
        FlatDaoImpl flatDao = new FlatDaoImpl(f.getConnection());
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("choice by parametrs: 1 - Distrrict, 2 - Address,  3 - Area, 4 - Rooms,  5 - Price,  6 - show all apartments");
            String choice = scn.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Choice:  Svyatoshin,  Podol,  Solomensry");
                    String c = scn.nextLine();
                    if (c.equalsIgnoreCase("Svyatoshin") || c.equalsIgnoreCase("Podol") || c.equalsIgnoreCase("Solomensry")) {
                        List<Flat> results = flatDao.findFlatForDistrict(c);
                        System.out.println(results);
                    } else {
                        System.out.println("choose from what offer");
                    }
                    break;
                case "2":
                    System.out.println("Choice: Relax street 10 ,  Druzhby street 2,  Green street 9");
                    String c2 = scn.nextLine();
                    if (c2.equalsIgnoreCase("Relax street 10") || c2.equalsIgnoreCase("Druzhby street 2") || c2.equalsIgnoreCase("Green street 9")) {
                        List<Flat> results = flatDao.findFlatForAddress(c2);
                        System.out.println(results);
                    } else {
                        System.out.println("choose from what offer");
                    }
                    break;
                case "3":
                    System.out.println("Choice: 70 square meters ,  45 square meters,  80 square meters");
                    String c3 = scn.nextLine();
                    if (c3.equalsIgnoreCase("70 square meters") || c3.equalsIgnoreCase("45 square meters") || c3.equalsIgnoreCase("80 square meters")) {
                        List<Flat> results = flatDao.findFlatForArea(c3);
                        System.out.println(results);
                    } else {
                        System.out.println("choose from what offer");
                    }
                    break;
                case "4":
                    System.out.println("Choice: 1 , 2, or 3");
                    int c4 = scn.nextInt();
                    if (c4 == 1 || c4 == 2 || c4 == 3) {
                        List<Flat> results = flatDao.findFlatForRooms(c4);
                        System.out.println(results);
                    } else {
                        System.out.println("choose from what offer");
                    }
                    break;
                case "5":
                    System.out.println("Choice: 50 000 ,  70 000 ,  120 000 ");
                    String c5 = scn.nextLine();
                    if (c5.equalsIgnoreCase("50 000") || c5.equalsIgnoreCase("70 000") || c5.equalsIgnoreCase("120 000")) {
                        List<Flat> results = flatDao.findFlatForPrice(c5);
                        System.out.println(results);
                    } else {
                        System.out.println("choose from what offer");
                    }
                    break;
                case "6":
                    List<Flat> results = flatDao.showAllFlat();
                    System.out.println(results);
                    break;
            }
        }
    }
}






