package com.pmtu.caffe.api.BeanUtils;

import com.pmtu.caffe.api.model.UserDTO;
import com.pmtu.caffe.entity.UserEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mr Tu on 11-05-2017.
 */
public class UserUtils {
    public List<UserDTO> convertToListUserDTO(List<UserEntity> userEntityList) {
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        UserDTO userDTO;
        for (UserEntity userEntity : userEntityList) {
            userDTO = new UserDTO(userEntity.getId(),
                    userEntity.getUsername(),
                    dateFormat.format(userEntity.getCreatedDate().toDate()),
                    userEntity.getModifiedDate() != null ? userEntity.getModifiedDate().toDate().toString() : "");
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }
}
