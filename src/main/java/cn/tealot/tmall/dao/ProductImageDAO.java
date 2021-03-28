
package cn.tealot.tmall.dao;
 
import java.util.List;

import cn.tealot.tmall.pojo.Product;
import cn.tealot.tmall.pojo.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}