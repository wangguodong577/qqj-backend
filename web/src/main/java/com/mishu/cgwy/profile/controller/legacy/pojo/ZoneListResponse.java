package com.mishu.cgwy.profile.controller.legacy.pojo;

import com.mishu.cgwy.common.wrapper.ZoneWrapper;
import com.mishu.cgwy.error.RestError;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class ZoneListResponse extends RestError {
    private List<ZoneWrapper> zones = new ArrayList<ZoneWrapper>();


}
