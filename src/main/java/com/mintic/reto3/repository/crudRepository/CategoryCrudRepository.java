/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.reto3.repository.crudRepository;

import com.mintic.reto3.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pc
 */
public interface CategoryCrudRepository extends CrudRepository<Category,Integer>{
    
}
