import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static boolean checkLeapYear (int checkYear) {
       boolean checkLeapYear = checkYear % 4 == 0 && checkYear % 100 != 0 || checkYear % 400 == 0;
       return checkLeapYear;
    }
    public static void checkDevice (int osDevice, int yearDevice) {
        int currentYear = LocalDate.now().getYear();
        if (yearDevice != currentYear){
            if (osDevice == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (osDevice == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void deliveryFood (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание №1");
        System.out.println("Введите год");
        Scanner year = new Scanner(System.in);
        int checkYear = year.nextInt();
        if (checkLeapYear(checkYear)) {
            System.out.println(checkYear + " год - високосныйгод");
        } else {
            System.out.println(checkYear + " год - не високосныйгод");
        }
        System.out.println();
    }
    public static void task2(){
        System.out.println("Задание №2");
        System.out.println("Введите год выпускаа Вашего устройства");
        Scanner year = new Scanner(System.in);
        int yearDevice = year.nextInt();
        System.out.println("Укажите операционную систему на Вашем устройстве: 0 - iOS, 1 - Android");
        Scanner os = new Scanner(System.in);
        int osDevice = os.nextInt();
        checkDevice(osDevice, yearDevice);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание №3");
        int deliveryDistance = 95;
        deliveryFood(deliveryDistance);
    }
}