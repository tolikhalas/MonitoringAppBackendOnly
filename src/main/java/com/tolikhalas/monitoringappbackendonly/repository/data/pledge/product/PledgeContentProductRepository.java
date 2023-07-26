package com.tolikhalas.monitoringappbackendonly.repository.data.pledge.product;

import com.tolikhalas.monitoringappbackendonly.model.data.pledge.product.PledgeContentProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PledgeContentProductRepository extends JpaRepository<PledgeContentProduct, Long> {
}
