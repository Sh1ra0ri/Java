import java.time.LocalDate;

public class Main {
    public static void verifyLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void suggestAppVersion(int osType, int year) {
        String os = osType == 0 ? "iOS" : "Android";
        if (year < 2015) {
            System.out.println("Установите облегченную версию приложения для " + os + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + os + " по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        verifyLeapYear(2020);
        verifyLeapYear(2021);
        suggestAppVersion(0, 2014);
        suggestAppVersion(1, 2015);
        int[] distances = {19, 65, 573};
        for (int distance : distances) {
            int days = calculateDeliveryDays(distance);
            System.out.println(days == -1 ? "Свыше 100 км доставки нет" : "Потребуется дней: " + days);
        }
    }
}