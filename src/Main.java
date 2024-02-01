public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
         System.out.println("Установите версию приложения для iOS по ссылке");
        } else {System.out.println("Ошибка!");}

        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задание 3");
        int year = 2021;
         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

         System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance < 100){
            System.out.println("Доставки нет!");
        }
        System.out.println("Доставка занимает: " + deliveryDays);

        System.out.println("Задание 5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 12:
                System.out.println(monthNumber + " это зимний месяц");
                break;
            case 1:
                System.out.println(monthNumber + " это зимний месяц");
                break;
            case 2:
                System.out.println(monthNumber + " это зимний месяц");
                break;
            case 3:
                System.out.println(monthNumber + " это весенний месяц");
                break;
            case 4:
                System.out.println(monthNumber + " это весенний месяц");
                break;
            case 5:
                System.out.println(monthNumber + " это весенний месяц");
                break;
            case 6:
                System.out.println(monthNumber + " это летний месяц");
                break;
            case 7:
                System.out.println(monthNumber + " это летний месяц");
                break;
            case 8:
                System.out.println(monthNumber + " это летний месяц");
                break;
            case 9:
                System.out.println(monthNumber + " это осенний месяц");
                break;
            case 10:
                System.out.println(monthNumber + " это осенний месяц");
                break;
            case 11:
                System.out.println(monthNumber + " это осенний месяц");
                break;
            default:
                System.out.println("Ошибка!");




        }

    }
}