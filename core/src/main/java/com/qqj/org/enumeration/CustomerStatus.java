package com.qqj.org.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum CustomerStatus {
    INVALID((short)0, "无效"),
    VALID((short)1, "正常");

    private Short value;
    private String name;

    public Short getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    private CustomerStatus(Short value, String name) {
        this.value = value;
        this.name = name;
    }

    public static CustomerStatus get(Short value) {
        for (CustomerStatus i : CustomerStatus.values()) {
            if (i.value.equals(value)) {
                return i;
            }
        }
        return null;
    }
}
