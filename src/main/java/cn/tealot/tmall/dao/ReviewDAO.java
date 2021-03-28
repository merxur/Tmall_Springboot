
package cn.tealot.tmall.dao;
 
import java.util.List;

import cn.tealot.tmall.pojo.Product;
import cn.tealot.tmall.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDAO extends JpaRepository<Review,Integer>{

	List<Review> findByProductOrderByIdDesc(Product product);
	int countByProduct(Product product);

}