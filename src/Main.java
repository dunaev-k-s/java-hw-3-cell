public class Main {
    public static void main(String[] arg){
        int count_rub = 15;
        int bonus_step_rub = 100;
        int refill_rub = 1001;
        int bonus = 0;
        if (refill_rub > 1000) {
            bonus = refill_rub / bonus_step_rub;
            count_rub = count_rub + refill_rub + bonus;
        }
        System.out.println("Bonus = " + bonus);
        System.out.println("Count = " + count_rub);
    }
}