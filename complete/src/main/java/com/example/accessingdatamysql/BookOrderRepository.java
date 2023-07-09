package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface BookOrderRepository extends CrudRepository<BookOrder, Integer> {
}
