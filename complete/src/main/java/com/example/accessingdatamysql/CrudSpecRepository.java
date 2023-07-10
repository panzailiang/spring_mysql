package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CrudSpecRepository<T, ID> extends CrudRepository<T, ID>, JpaSpecificationExecutor<T> {
}
