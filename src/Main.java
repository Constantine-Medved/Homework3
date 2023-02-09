public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
        System.out.println("За " + productionTimeMinutes + " мин. машина произвела " + productionCapacityForMinutes + " шт. бутылок");
        int productionTimeDays = 1;
        int productionCapacityForDays = productionTimeDays * 24 * 60 * productionCapacityPerMinute;
        System.out.println("За " + productionTimeDays + " дн. машина произвела " + productionCapacityForDays + " шт. бутылок");
        productionTimeDays = productionTimeDays * 3;
        productionCapacityForDays = productionTimeDays * 24 * 60 * productionCapacityPerMinute;
        System.out.println("За " + productionTimeDays + " дн. машина произвела " + productionCapacityForDays + " шт. бутылок");
        int productionTimeMonths = 1;
        int productionCapacityForMonth = productionTimeMonths * 30 * 24 * 60 * productionCapacityPerMinute;
        System.out.println("За " + productionTimeMonths + " мес. машина произвела " + productionCapacityForMonth + " шт. бутылок");
    }
    public static void task5() {
        int totalPaintQtyPerSchool = 120;
        int whitePaintQtyPerClass = 2;
        int brownPaintQtyPerClass = 4;
        int totalPaintQtyPerClass = whitePaintQtyPerClass + brownPaintQtyPerClass;
        int classesQtyInSchool = totalPaintQtyPerSchool / totalPaintQtyPerClass;
        int whitePaintQtyPerSchool = whitePaintQtyPerClass * classesQtyInSchool;
        int brownPaintQtyPerSchool = brownPaintQtyPerClass * classesQtyInSchool;
        System.out.println("В школе, где " + classesQtyInSchool + " классов, нужно " + whitePaintQtyPerSchool + " банок белой краски и " + brownPaintQtyPerSchool + " банок коричневой краски");
    }
}