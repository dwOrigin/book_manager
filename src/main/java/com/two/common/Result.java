package com.two.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String code;
    private String message;
    private Object data;

    public static Result success(){
        return new Result(Constants.CODE_200,"",null);
    }
    public static Result success(Object data){
        return new Result(Constants.CODE_200,"",data);
    }
    public static Result error(String code,String message){
        return new Result(code,message,null);
    }
    public static Result success(String code,String message){
        return new Result(code,message,null);
    }
    public static Result success(String code,String message,Object data){
        return new Result(code,message,data);
    }
    public static Result error(){
        return new Result(Constants.CODE_500,"",null);
    }

}
