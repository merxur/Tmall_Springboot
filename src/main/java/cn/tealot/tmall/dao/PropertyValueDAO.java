
package cn.tealot.tmall.dao;
 

import java.util.List;

import cn.tealot.tmall.pojo.Product;
import cn.tealot.tmall.pojo.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import cn.tealot.tmall.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}