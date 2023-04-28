public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int operatingSystem = 0;
        int clientOS = 0;
        int clientAndroid = 1;
        if (operatingSystem == clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operatingSystem == clientAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой версии операционной системы у нас нет, приносим извинения");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int operatingSystem = 1;
        int clientOS = 0;
        int clientAndroid = 1;
        int clientDeviceYear = 2013;

        if (operatingSystem == clientOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operatingSystem == clientAndroid && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operatingSystem == clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operatingSystem == clientAndroid && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 1;
        int deliveryDay = 1;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDay++;
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }

}