public class Class1 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        System.out.println(canBuy(isEdekaOpen, isReweOpen));
    }

    public static boolean canBuy(boolean shop1, boolean shop2) {

        boolean openShop = shop1 == true || shop2 == true ? true : false;

        if (shop1 == true && shop2 == true) {
            System.out.println("Я могу купить еду, это  Edeka и Rewe");
        } else if (shop1 == true) {
            System.out.println("Я могу купить еду, это  Edeka");
        } else if (shop2 == true) {
            System.out.println("Я могу купить еду, это  Rewe");
        }
        return openShop;
    }
}
