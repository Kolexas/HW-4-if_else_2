public class Main {
    public static void main(String[] args) {
        // Homework №4 Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию для приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию для приложения для Android по ссылке");
        }
        // Задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию для приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию для приложения для Android по ссылке");
            }
        }
            // Задание 3
            int year = 1584;
            if (year >= 1584) {
                if (year % 400 == 0 || year % 4 == 0 && year % 100 !=0) {
                    System.out.println(year + " год является высокосным");
                } else {
                    System.out.println(year + " год не является высокосным");
                }
            } else {
                System.out.println(year + " год не является высокосным");
            }
            // Задание 4
            int deliveryDistance = 20;
            int deliveryTime = 1;
            if (deliveryDistance > 100) {
                System.out.print("Доставка невозможна");
            } else {
                System.out.print("Потребуется дней: ");
            }
                if (deliveryDistance <= 20) {
                    System.out.print(deliveryTime);
                }
                if (deliveryDistance > 20 && deliveryDistance <= 60) {
                    deliveryTime = deliveryTime + 1;
                    System.out.print(deliveryTime);
                } else if (deliveryDistance > 60) {
                    deliveryTime = deliveryTime + 2;
                    System.out.print(deliveryTime);
                }
            // Задание 5
            int monthNumber = 12;
            if (monthNumber <= 12) {
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.print("\nСезон зимы");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.print("\nСезон весны");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.print("\nСезон лета");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.print("\nСезон осени");
                        break;
                }
            } else {
                System.out.print("\nТакого месяца нет");
            }
        }
    }