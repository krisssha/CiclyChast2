public class Main {
    public static void main(String[] args) {

                int salary = 29000;

                int total = 0;
                int mounth = 0;
                while (total < 2459000) {

                    int interest = (total * 12 / 100) / 12; // проценты на текущую сумму
                    total += 15000 + interest;
                    mounth++;
                    System.out.println("проценты по вкладу на каждый месяц " + interest);
                    System.out.println("сумму накоплений за каждый месяц учитывая проценты на остаток " + total);
                    //  System.out.println("Месяц " + l + " , сумма накоплений равна " + total + " рублей");
                }
                System.out.println("_____________________________________");
                System.out.println("итогова сумма накоплений включая проценты " + total);
                // System.out.println();
                System.out.println("количество месяцев сколько потребовалось " + mounth);

                System.out.println("___________________________________");

                int a = 0;
                while (a < 10) {
                    a++;
                    System.out.print(a + " ");
                }
                System.out.println();
                for (int b = 10; b >= 1; b--) {
                    System.out.print(b + " ");
                }
        System.out.println();
        System.out.println("______________________");
                int population = 12_000_000;
                int fertility = 17;
                int mortality = 8;
                int growth1000 = fertility - mortality;
                int growth = growth1000 * 12000;
                int numberFor1Year = population + growth;

                for (int i = 1; i <= 10; i++) {
                    numberFor1Year += growth;
                    System.out.println("Год " + i + " численность населения составляет " + numberFor1Year);
                }

        System.out.println("__________________________________________");
        int initialAmount = 15000;//зарплата
        int accumulation = 15000;

        for (int mounth1 = 0; accumulation <= 2_000_0000; mounth1++) {
            accumulation += (int) (accumulation * 0.07) + initialAmount;
            if (mounth % 6 == 0) {
                System.out.println(mounth1 + " месяц " + " накопления с учетом 7% " + accumulation);
            }

        }
        System.out.println("______________________________________________");

        int salary1 = 15000;
        int depositFor1mounth = 15000;
        int nineYears  = 108;
        for (int mounth1 = 0; mounth1 <= 108; mounth1++ ) {
            depositFor1mounth += (int) (depositFor1mounth * 0.07) + salary1;
            if (mounth1 % 6 == 0){
                System.out.println(mounth1 + " месяц " + " накопленная сумма " + depositFor1mounth);
            }
        }
        System.out.println("______________________________________________");

        int fridayNumber = 4;
        for (int m = 4; m <= 31; m += 7) {

            System.out.println("Сегодня пятница, " + m + "-е число. Необходимо подготовить отчет.");

        }
        System.out.println("_________________________________________________");
        int startYear = 1800;
        int endYear = 2100;
        while (startYear <= endYear) {
            startYear++;
            if (startYear % 79 == 0){
                System.out.println(startYear);
            }
        }
        System.out.println("______________________--");

        int t = 2;
        for(int i = 0; i<=10; i++){
            System.out.println(t + " * " + i + " = "
                    + t * i);
        }
    }
}
