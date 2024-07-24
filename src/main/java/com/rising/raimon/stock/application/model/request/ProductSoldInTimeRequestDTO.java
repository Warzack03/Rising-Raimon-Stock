package com.rising.raimon.stock.application.model.request;

import com.rising.raimon.stock.domain.model.enums.ProductTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductSoldInTimeRequestDTO {

    private ProductTypeEnum productType;
    private LocalDate startDate;
    private LocalDate endDate;

}