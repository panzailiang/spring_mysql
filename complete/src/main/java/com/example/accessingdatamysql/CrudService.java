package com.example.accessingdatamysql;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CrudService<ID, T> {
    T create(T entity);
    Optional<T> retrieve(ID id);
    Page<T> list(List<SearchCriteria> searchCriteria, Pageable page);
}
