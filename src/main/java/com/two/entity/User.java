package com.two.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author youbai
 * @since 2022-08-02
 */
@Data
  @ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("账号名")
        @TableId(value = "id", type = IdType.AUTO)
      private String id;

      @ApiModelProperty("密码组成任意")
      private String password;

      @ApiModelProperty("姓名")
      private String name;

      @ApiModelProperty("电话号码")
      private String phoneNumber;

      @ApiModelProperty("可借书籍为1，不可借书籍为0")
      private Integer state;

      @ApiModelProperty("管理员为1，用户为0")
      private Integer orAdmin;


}
