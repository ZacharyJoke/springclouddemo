package com.lxl.productorser.repository;

import com.lxl.productorser.bean.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationJpaRepository extends JpaRepository<Organization,String> {
    public Organization findById(String organizationId);
}
