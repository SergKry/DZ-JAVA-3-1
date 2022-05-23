public class BonusMilesService {
    public int calculate(int price) {
        int miles;                 // переменная мили
        if (price > 0) {           // если сумма покупки больше 0
            miles = price / 20;
        } else {

            miles = 0;
        }
        return miles;            // передача бонусных миль
    }
}
