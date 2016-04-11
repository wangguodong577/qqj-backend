package com.mishu.cgwy.common.wrapper;

import com.mishu.cgwy.common.domain.City;
import lombok.Data;

/**
 * User: xudong
 * Date: 3/6/15
 * Time: 4:43 PM
 */
@Data
public class CityWrapper {
    private Long id;

    private String name;

    public CityWrapper() {
    }

    public CityWrapper(City city) {
        this.id = city.getId();
        this.name = city.getName();
    }
}
