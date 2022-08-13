package factoryMethod;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("에단이 주문한" + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("조엘이 주문한" + pizza.getName() + "\n");
	}

}
