package cn.tealot.tmall.service;

import cn.tealot.tmall.dao.CategoryDAO;
import cn.tealot.tmall.pojo.Category;
import cn.tealot.tmall.pojo.Product;
import cn.tealot.tmall.util.Page4Navigator;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceTest extends TestCase {
    @Autowired
    CategoryDAO categoryDAO;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        Category bean=new Category();
        categoryDAO.save(bean);
    }

    @Test
    public void testDelete() {
        categoryDAO.delete(1);
    }

    @Test
    public void testGet() {
        Category c= categoryDAO.findOne(1);
    }

    @Test
    public void testUpdate() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(1, 5,sort);
        Page pageFromJPA =categoryDAO.findAll(pageable);

        new Page4Navigator<>(pageFromJPA,1);
    }

    @Test
    public void testList() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        categoryDAO.findAll(sort);
    }

    @Test
    public void testTestList() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        categoryDAO.findAll(sort);
    }

    @Test
    public void testRemoveCategoryFromProduct() {
        List<Category> cs=new ArrayList<>();
        for (Category category : cs) {
            testTestRemoveCategoryFromProduct(category);
        }
    }

    @Test
    public void testTestRemoveCategoryFromProduct(Category category) {
        List<Product> products =category.getProducts();
        if(null!=products) {
            for (Product product : products) {
                product.setCategory(null);
            }
        }

        List<List<Product>> productsByRow =category.getProductsByRow();
        if(null!=productsByRow) {
            for (List<Product> ps : productsByRow) {
                for (Product p: ps) {
                    p.setCategory(null);
                }
            }
        }
    }
}