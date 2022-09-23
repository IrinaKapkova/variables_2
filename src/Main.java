public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a = 2_122;
        byte b = 5;
        short c = 12_345;
        long d = 1_234_567_890;
        float e = 1.234f;
        double x = -1.2345678d;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом int равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом int равно " + d);
        System.out.println("Значение переменной e с типом int равно " + e);
        System.out.println("Значение переменной x с типом int равно " + x);

        // Задача 2
        System.out.println("Задача 2");

        float n = 27.12f;
        long m = 987678965549L;
        double p = 2.786;
        boolean r = false;
        short l = 569;
        short o = -159;
        int s = 27_897;
        byte k = 67;
        char t = 42;
        System.out.println(n);
        System.out.println(m);
        System.out.println(p);
        System.out.println(r);
        System.out.println(l);
        System.out.println(o);
        System.out.println(s);
        System.out.println(k);
        System.out.println(t);

        // Задача 3
        System.out.println("Задача 3");
        short numberStudents1 = 23;
        short numberStudents2 = 27;
        short numberStudents3 = 30;
        int totalNumberStudents;
        totalNumberStudents = numberStudents1 + numberStudents2 + numberStudents3;
        short totalNumberSheets = 480;
        int numberSheetsForOne = totalNumberSheets / totalNumberStudents;
        System.out.println("На каждого ученика рассчитано " + numberSheetsForOne + " листов бумаги");


        // Задача 4
        System.out.println("Задача 4");
        int machinePerformance = 16 / 2;

        System.out.println("За 20 минут машина произвела " + 20 * machinePerformance + " бутылок");
        System.out.println("За сутки  машина произвела " + 24 * 60 * machinePerformance + " бутылок");
        System.out.println("За 3 дня машина произвела " + 3 * 24 * 60 * machinePerformance + " бутылок");
        System.out.println("За  1 месяц машина произвела  " + 30 * 24 * 60 * machinePerformance + " бутылок");

        // Задача 5
        System.out.println("Задача 5");
        int whiteForRoom = 2;
        int brownForRoom = 4;
        int totalForRoom;
        totalForRoom = whiteForRoom + brownForRoom;
        int rooms = 120 / totalForRoom;
        int totalWhite;
        int totalBrown;
        totalWhite = rooms * whiteForRoom;
        totalBrown = rooms * brownForRoom;
        System.out.println("В школе, где " + rooms + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int weightBananas = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEggs = 70;
        int totalWeightBananas = weightBananas * 5;
        int totalWeightMilk = 2 * weightMilk;
        int totalWeightIceCream = weightIceCream * 2;
        int totalWeightEggs = weightEggs * 4;
        double breakfastWeighGr = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        double breakfastWeighKg = breakfastWeighGr / 1000;
        System.out.println("Вес (количество грамм) такого спорт-завтрака " + breakfastWeighGr);
        System.out.println("Вес (количество килограмм) такого спорт-завтрака " + breakfastWeighKg);

        // Задача 7
        System.out.println("Задача 7");
        short totalWeightReduction = 7 * 1000;
        short dayWeightReduction1 = 500;
        short dayWeightReduction2 = 250;
        short minDays = (short) (totalWeightReduction / dayWeightReduction1);
        short maxDays = (short) (totalWeightReduction / dayWeightReduction2);
        short mediumDays = (short) ((minDays + maxDays) / 2);
        System.out.println("Если спортсмен будет терять по 250 грамм веса в день, ему потребуется " + maxDays + " дней, чтоб остаться в своей весовой категории");
        System.out.println("Если спортсмен будет терять по 500 грамм веса в день, ему потребуется " + minDays + " дней, чтоб остаться в своей весовой категории");
        System.out.println("В среднем ему может потребоваться для того, чтоб сбросить 7 кг " + mediumDays + " день");

        // Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int salaryMasha2 = (int) (salaryMasha * 1.1);
        int salaryDenis2 = (int) (salaryDenis * 1.1);
        int salaryKristina2 = (int) (salaryKristina * 1.1);
        int yearDifferenceMasha = (salaryMasha2 - salaryMasha) * 12;
        int yearDifferenceDenis = (salaryDenis2 - salaryDenis) * 12;
        int yearDifferenceKristina = (salaryKristina2 - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + salaryMasha2 + " рублей. Годовой доход вырос на " + yearDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis2 + " рублей. Годовой доход вырос на " + yearDifferenceDenis + " рублей");
        System.out.println("Маша теперь получает " + salaryKristina2 + " рублей. Годовой доход вырос на " + yearDifferenceKristina + " рублей");
    }
}
