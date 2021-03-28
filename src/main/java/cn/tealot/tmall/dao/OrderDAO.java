
package cn.tealot.tmall.dao;
 
import java.util.List;

import cn.tealot.tmall.pojo.Order;
import cn.tealot.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}