package com.it7890.utils;

import java.io.Serializable;

/**
 * Created by mingle on 2018/5/9.
 */
public class ServiceException extends RuntimeException implements Serializable {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
