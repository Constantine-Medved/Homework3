public class Main {
    public static void main(String[] args) {
        task1();
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
        float juiceInOneOrange = 0.23333F;
        System.out.println("Значение переменной juiceInOneOrange с типом float равно " + juiceInOneOrange);
        double juiceInOneContainer = 10021590352.66333E+39;
        System.out.println("Значение переменной juiceInOneContainer с типом double равно " + juiceInOneContainer);
    }
}