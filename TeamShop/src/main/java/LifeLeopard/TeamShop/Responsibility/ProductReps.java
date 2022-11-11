package LifeLeopard.TeamShop.Responsibility;

import LifeLeopard.TeamShop.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface ProductReps extends JpaRepository<Product,Integer> {
    List<Product> findAllByProductNameLike(String productName);
    List<Product> findAllByStatusIs(int Status);
}
