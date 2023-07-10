package com.example.accessingdatamysql;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
    T create(T entity);
    Optional<T> retrieve(ID id);
    Page<T> list(Collection<SearchCriteria> searchCriteria, Pageable page);
}
