package com.two.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@Getter
@Setter
  @ApiModel(value = "Book对象", description = "")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("书籍id")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("书籍name")
      private String name;

      @ApiModelProperty("出版社")
      private String press;

      @ApiModelProperty("作者")
      private String author;

      @ApiModelProperty("书籍总数（大于所有图书号）")
      private Integer totalNumber;

    private Integer bookId;


}
