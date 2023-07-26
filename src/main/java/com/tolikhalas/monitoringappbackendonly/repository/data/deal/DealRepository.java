package com.tolikhalas.monitoringappbackendonly.repository.data.deal;

import com.tolikhalas.monitoringappbackendonly.model.data.deal.Deal;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface DealRepository extends JpaRepository<Deal, Long> {

    Optional<Deal> findByDealNumber(String dealNumber);

    Optional<Deal> findByDealDate(LocalDate dealDate);

}
