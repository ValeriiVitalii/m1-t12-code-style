import java.util.Scanner;
public class DepositCalculator  {

    double calculateComplexPercent(double amount, double percent,int period ) {
        double pay = amount * Math.pow((1 + percent / 12), 12 * period);

        return random(pay, 2);
      }

      double calculateSimplePercent(double doubleAmount,double doubleYearRate, int depositPeriod) {
          return random(doubleAmount + doubleAmount * doubleYearRate * depositPeriod, 2);
     }

      double random (double value,int places) {
           double scale = Math.pow(10, places);

           return Math.round(value * scale) / scale;
    }

    void countingDeposit() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:") ;
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double typeOfDeposit = 0;
            if (action == 1) {
                typeOfDeposit = calculateComplexPercent(amount, 0.06, period);
         }  else if (action == 2) {
                typeOfDeposit = calculateSimplePercent(amount, 0.06, period);
        }
            System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + typeOfDeposit);
    }

    public static void main(String[] args) {
        new DepositCalculator().countingDeposit();
}

}
