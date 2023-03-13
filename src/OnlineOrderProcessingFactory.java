public class OnlineOrderProcessingFactory {
    public static Order addOrder(OnlineOrderEnum onlineOrderType) throws  InstantiationException, IllegalAccessException {
        return onlineOrderType.getObject();
    }
}
