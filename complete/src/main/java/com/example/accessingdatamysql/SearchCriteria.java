package com.example.accessingdatamysql;

import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class SearchCriteria {
    private String key;
    private String value;
    private OperationEnum operation;


    public static <T> Specification<T> toSpecification(Collection<SearchCriteria> queryParams) {
        List<Specification<T>> specs = queryParams.stream().map(criteria -> {
            return (Specification<T>) (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(criteria.getKey()), criteria.getValue());
        }).collect(Collectors.toList());
        return Specification.allOf(specs);
    }
}
