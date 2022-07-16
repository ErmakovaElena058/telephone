public class telephone {
    public static void main(String[] args) {

        int score = 100;
        System.out.println("Остаток на счете: " + score);

        int refill = 1100;
        System.out.println("Сумма пополнения: " + refill);

        int bonus;
        if (refill > 1000){
            bonus = 1;
        } else {
            bonus = 0;} 
        
        int gift = refill / 100 * bonus;

       System.out.println("Итоговый бонус: " + gift);

       int FinalScore = score + refill + gift;
        System.out.println("Итого на счете: " + FinalScore);
        }
}



