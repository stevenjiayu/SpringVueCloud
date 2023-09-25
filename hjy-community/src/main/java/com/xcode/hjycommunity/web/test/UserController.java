package com.xcode.hjycommunity.web.test;


import com.xcode.hjycommunity.common.core.domain.BaseResponse;
import com.xcode.hjycommunity.common.core.exception.BaseException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/userByID")
    public BaseResponse<User> queryUserByID(String userID){

        if (userID != null){

            return BaseResponse.success(new User(userID,"steven"));
        }else {

            return BaseResponse.fail("查詢訊息失敗");
        }

    }

    @RequestMapping("/addUser")
    public BaseResponse addUser(@Validated User user, BindingResult bindingResult){

        List<FieldError> fieldErrors = bindingResult.getFieldErrors();

        if(!fieldErrors.isEmpty()){
            return BaseResponse.fail(fieldErrors.get(0).getDefaultMessage());
        }

        return BaseResponse.success("OK");

    }

    @RequestMapping("/queryUser")
    public BaseResponse queryUser(User user){

        throw new BaseException ("500","test excetion");

    }

}
