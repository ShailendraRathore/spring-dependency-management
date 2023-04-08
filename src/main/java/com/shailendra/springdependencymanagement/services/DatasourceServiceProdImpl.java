package com.shailendra.springdependencymanagement.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class DatasourceServiceProdImpl implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Prod Datasource";
    }
}
