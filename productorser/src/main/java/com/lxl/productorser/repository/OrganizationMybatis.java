package com.lxl.productorser.repository;

import com.lxl.productorser.bean.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationMybatis{
    List<Organization> findList();
}
