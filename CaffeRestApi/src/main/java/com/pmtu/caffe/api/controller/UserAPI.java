package com.pmtu.caffe.api.controller;

import com.pmtu.caffe.api.BeanUtils.UserUtils;
import com.pmtu.caffe.api.model.UserDTO;
import com.pmtu.caffe.entity.UserEntity;
import com.pmtu.caffe.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Mr Tu on 07-05-2017.
 */
@Controller
@RequestMapping("/api/user/")
public class UserAPI {
    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    UserService userService=(UserService)context.getBean("userService");
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public @ResponseBody List<UserDTO> list() {
        try {
            List<UserDTO> list = new UserUtils().convertToListUserDTO(userService.getall());
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
