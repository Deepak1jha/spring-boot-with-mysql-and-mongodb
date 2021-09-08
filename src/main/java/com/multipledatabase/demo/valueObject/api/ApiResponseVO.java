package com.multipledatabase.demo.valueObject.api;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ApiResponseVO implements Serializable {

    private String responseType;
    private String message;
    private Object data;

    public ApiResponseVO(String responseType, String message, Object data) {
        this.responseType = responseType;
        this.message = message;
        this.data = data;
    }

}
