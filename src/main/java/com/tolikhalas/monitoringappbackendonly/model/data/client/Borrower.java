package com.tolikhalas.monitoringappbackendonly.model.data.client;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Class that represents "Позичальник"
 */
@Entity(name = "borrower")
@Data
@EqualsAndHashCode(callSuper = false)
public class Borrower extends Client {

}
