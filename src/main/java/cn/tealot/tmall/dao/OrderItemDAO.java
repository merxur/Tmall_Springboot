
package cn.tealot.tmall.dao;

import java.util.List;

import cn.tealot.tmall.pojo.Order;
import cn.tealot.tmall.pojo.OrderItem;
import cn.tealot.tmall.pojo.Product;
import cn.tealot.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}