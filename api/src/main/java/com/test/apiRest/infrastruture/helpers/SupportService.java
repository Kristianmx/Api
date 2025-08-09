package com.test.apiRest.infrastruture.helpers;

import com.test.apiRest.util.exceptions.IdNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SupportService<Entity> {
    public Entity findByID(JpaRepository<Entity, Integer> repository, Integer id, String  message){
        return repository.findById(id).orElseThrow(()-> new IdNotFoundException(message));
    }

}
