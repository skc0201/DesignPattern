public enum OnlineOrderEnum {
    FOOD(Food.class),
    CLOTHING(Clothing.class),
    FURNITURE(Furniture.class);

    private Class orderClassName;

    OnlineOrderEnum(Class orderClassName) {
        this.orderClassName = orderClassName;
    }
    public Order getObject() throws InstantiationException, IllegalAccessException {
        return (Order) orderClassName.newInstance();
    }
}
