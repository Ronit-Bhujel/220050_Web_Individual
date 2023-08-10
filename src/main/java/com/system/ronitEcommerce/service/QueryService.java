package com.system.ronitEcommerce.service;

import com.system.ronitEcommerce.entity.Queries;
import com.system.ronitEcommerce.pojo.QueriesPojo;

import java.util.List;

public interface QueryService {
    List<Queries> fetchAll();

    String save(QueriesPojo queriesPojo);
}
