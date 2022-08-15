package com.example.handlingformsubmission;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PepoleRespository extends CrudRepository<Pepole,Long> {

}
