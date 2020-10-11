package com.nxdomax.ssm.v101.iinterface;

import com.nxdomax.ssm.v101.base.ZToken;

import java.lang.annotation.*;

/**
 * @Author: Adam ZHU
 * @Date: 2020/10/10 23:16
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AValidateUser {

//    Class<?extends ZToken> poClass();
}
