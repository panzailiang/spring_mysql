package com.example.accessingdatamysql;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<T, ID> implements CrudService<T, ID>{

    protected abstract CrudSpecRepository<T, ID> getRepository();

    @Override
    public T create(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public Optional<T> retrieve(ID id) {
        return getRepository().findById(id);
    }

    @Override
    public Page<T> list(Collection<SearchCriteria> queryParams, Pageable page) {
        return null;
    }
}
