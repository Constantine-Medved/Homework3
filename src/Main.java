public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        byte orangesContainersQuantity = 127;
        System.out.println("Значение переменной orangesContainersQuantity с типом byte равно " + orangesContainersQuantity);
        short orangesPalletsQuantity = 32767;
        System.out.println("Значение переменной orangesPalletsQuantity с типом short равно " + orangesPalletsQuantity);
        int orangesBoxesQuantity = 2147483647;
        System.out.println("Значение переменной orangesBoxesQuantity с типом int равно " + orangesBoxesQuantity);
        long orangesQuantity = 42949672940L;
        System.out.println("Значение переменной orangesQuantity с типом long равно " + orangesQuantity);
        float juiceInOneOrange = 0.23333f;
        System.out.println("Значение переменной juiceInOneOrange с типом float равно " + juiceInOneOrange);
        double juiceInOneContainer = 10021590352.66333E+39;
        System.out.println("Значение переменной juiceInOneContainer с типом double равно " + juiceInOneContainer);
    }
    public static void task2() {
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3() {
        byte studentsQtyLudmilaClass = 23;
        byte studentsQtyAnnaClass = 28;
        byte studentsQtyEkaterinaClass = 30;
        int studentsQtyTotal = studentsQtyLudmilaClass + studentsQtyAnnaClass + studentsQtyEkaterinaClass;
        float totalSheetsQty = 480f;
        float oneStudentSheetsQty = totalSheetsQty / studentsQtyTotal;
        System.out.println("На каждого ученика рассчитано " + oneStudentSheetsQty + " листов бумаги.");
    }
    public static void task4() {
        byte productionCapacityQtyInitial = 16;
        byte productionTimeMinutesInitial = 2;
        int productionCapacityPerMinute = productionCapacityQtyInitial / productionTimeMinutesInitial;
        int productionTimeMinutes = 1;
        productionTimeMinutes = productionTimeMinutes * 20;
        int productionCapacityForMinutes = productionTimeMinutes * productionCapacityPerMinute;
        System.out.println("За " + productionTimeMinutes + " мин. машина произвела " + productionCapacityForMinutes + " шт. бутылок.");
        int productionTimeDays = 1;
        int productionCapacityForDays = productionTimeDays * 24 * 60 * productionCapacityPerMinute;
        System.out.println("За " + productionTimeDays + " дн. машина произвела " + productionCapacityForDays + " шт. бутылок.");
        productionTimeDays = productionTimeDays * 3;
        productionCapacityForDays = productionTimeDays * 24 * 60 * productionCapacityPerMinute;
        System.out.println("За " + productionTimeDays + " дн. машина произвела " + productionCapacityForDays + " шт. бутылок.");
        int productionTimeMonths = 1;
        int productionCapacityForMonth = productionTimeMonths * 30 * 24 * 60 * productionCapacityPerMinute;
        System.out.println("За " + productionTimeMonths + " мес. машина произвела " + productionCapacityForMonth + " шт. бутылок.");
    }
    public static void task5() {
        int totalPaintQtyPerSchool = 120;
        int whitePaintQtyPerClass = 2;
        int brownPaintQtyPerClass = 4;
        int totalPaintQtyPerClass = whitePaintQtyPerClass + brownPaintQtyPerClass;
        int classesQtyInSchool = totalPaintQtyPerSchool / totalPaintQtyPerClass;
        int whitePaintQtyPerSchool = whitePaintQtyPerClass * classesQtyInSchool;
        int brownPaintQtyPerSchool = brownPaintQtyPerClass * classesQtyInSchool;
        System.out.println("В школе, где " + classesQtyInSchool + " классов, нужно " + whitePaintQtyPerSchool + " банок белой краски и " + brownPaintQtyPerSchool + " банок коричневой краски.");
    }
    public static void task6() {
        byte bananaQty = 5;
        byte oneBananaWeightGram = 80;
        int totalBananaWeight = bananaQty * oneBananaWeightGram;
        short milkVolumeMl = 200;
        short milkWeighGramIn100Ml = 105;
        int totalMilkWeight =  (milkVolumeMl / 100) * milkWeighGramIn100Ml;
        byte iceCreamQty = 2;
        byte oneIceCreamWeightGram = 100;
        int totalIceCreamWeightGram = iceCreamQty * oneIceCreamWeightGram;
        byte eggsQty = 4;
        byte oneEggWeightGram = 70;
        int totalEggWeightGram = eggsQty * oneEggWeightGram;
        float breakfastWeightsGram = totalBananaWeight + totalMilkWeight + totalIceCreamWeightGram + totalEggWeightGram;
        System.out.println(breakfastWeightsGram);
        float breakfastWeightsKg = breakfastWeightsGram / 1000;
        System.out.println(breakfastWeightsKg);
    }
    public static void task7() {
        int loseWeightTotal = 7;
        float dailyLosingWeightFirstDietGram = 250f;
        float dailyLosingWeightFirstDietKg = dailyLosingWeightFirstDietGram / 1000;
        float dailyLosingWeightSecondDietGram = 500f;
        float dailyLosingWeightSecondDietKg = dailyLosingWeightSecondDietGram / 1000;
        float daysForLosingWeightFirstDiet = loseWeightTotal / dailyLosingWeightFirstDietKg;
        System.out.println(daysForLosingWeightFirstDiet);
        float daysForLosingWeightSecondDiet = loseWeightTotal / dailyLosingWeightSecondDietKg;
        System.out.println(daysForLosingWeightSecondDiet);
        float daysForLosingWeightAverage = (daysForLosingWeightFirstDiet + daysForLosingWeightSecondDiet) / 2;
        System.out.println(daysForLosingWeightAverage);
    }
    public static void task8() {
        float mashaCurrentSalary = 67760f;
        float denisCurrentSalary = 83690f;
        float kristinaCurrentSalary = 76230f;
        float mashaCurrentAnnualSalary = mashaCurrentSalary * 12;
        float denisCurrentAnnualSalary = denisCurrentSalary * 12;
        float kristinaCurrentAnnualSalary = kristinaCurrentSalary * 12;
        float mashaNewSalary = (float) (mashaCurrentSalary * 1.1);
        float denisNewSalary = (float) (denisCurrentSalary * 1.1);
        float kristinaNewSalary = (float) (kristinaCurrentSalary * 1.1);
        float mashaNewAnnualSalary = mashaNewSalary * 12;
        float denisNewAnnualSalary = denisNewSalary * 12;
        float kristinaNewAnnualSalary = kristinaNewSalary * 12;
        float mashaAnnualSalaryIncreasing = mashaNewAnnualSalary - mashaCurrentAnnualSalary;
        float denisAnnualSalaryIncreasing = denisNewAnnualSalary - denisCurrentAnnualSalary;
        float kristinaAnnualSalaryIncreasing = kristinaNewAnnualSalary - kristinaCurrentAnnualSalary;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualSalaryIncreasing + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualSalaryIncreasing + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualSalaryIncreasing + " рублей.");
    }
}