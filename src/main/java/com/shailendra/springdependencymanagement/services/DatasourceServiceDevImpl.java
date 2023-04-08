package com.shailendra.springdependencymanagement.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DatasourceServiceDevImpl implements DatasourceService {
    @Override
    public String getDatasource() {
        return "DEV Datasource";
    }
}
