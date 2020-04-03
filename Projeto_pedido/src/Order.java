import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	Date moment = new Date();
	OrderStatus status;
	Client client;
	List<OrderItem> orderItem = new ArrayList<>();
	public static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem orderItem) {
		this.orderItem.add(orderItem);
	}
	public void removeItem(OrderItem orderItem) {
		this.orderItem.remove(orderItem);
	}
	public Double subTotal() {
		double total = 0;
		for(OrderItem c: orderItem) {
			total += c.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: "+sdf1.format(moment)+"\n");
		sb.append(status+"\n");
		sb.append("Client: "+client+"\n");
		for(OrderItem c: orderItem) {
			sb.append(String.format("%s, Quantity: %d, Subtotal %.2f\n",c.getProduct().getName(),c.getQuantity(),c.subTotal()));
		}
        sb.append(String.format("Total price: %.2f",subTotal()));
        return sb.toString();
	}
}
