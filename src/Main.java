public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("*****Factory Design Pattern*****");

        Order food =  OnlineOrderProcessingFactory.addOrder(OnlineOrderEnum.FOOD);
        food.orderProcessing();

        Order furniture =  OnlineOrderProcessingFactory.addOrder(OnlineOrderEnum.FURNITURE);
        furniture.orderProcessing();
    }
}