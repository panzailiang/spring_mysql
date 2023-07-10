package com.example.accessingdatamysql;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Optional;

public abstract class BaseController<T, ID> {
    protected abstract CrudService<T, ID> getSerivce();

    @PostMapping("")
    public T create(T entity){
        return getSerivce().create(entity);
    }

    @GetMapping("/{id}")
    public Optional<T> retrieve(@PathVariable ID id){
        return getSerivce().retrieve(id);
    }

    @GetMapping()
    public Page<T> list(@RequestParam Map<String, String> queryParams){
        return null;
    }
}
