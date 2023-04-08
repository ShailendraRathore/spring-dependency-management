package com.shailendra.springdependencymanagement.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class DatasourceServiceQAImpl implements DatasourceService {
    @Override
    public String getDatasource() {
        return "QA Datasource";
    }
}
