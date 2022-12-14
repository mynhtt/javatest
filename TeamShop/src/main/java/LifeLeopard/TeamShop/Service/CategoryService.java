package LifeLeopard.TeamShop.Service;

import LifeLeopard.TeamShop.Models.Category;
import LifeLeopard.TeamShop.Responsibility.CategoryReps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryReps categoryReps;
    public List<Category> getAllCategory(){
        return categoryReps.findAll();
    }
}
