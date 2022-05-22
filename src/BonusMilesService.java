public class BonusMilesService {
    public int calculate (int x) {
        int price;
        if (x > 0) {
            price = x / 20;
        } else {

        price =0;
        }
        return price;
    }
}
