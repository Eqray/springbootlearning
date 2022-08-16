package com.example.demo;

import lombok.Data;

@Data
public class CustomResponse {
    private boolean isok;
    private int code;
    private String messge;
    private Object data;

    public CustomResponse(){}

    public static CustomResponse success(Object obj){
        CustomResponse response = new CustomResponse();
        response.setIsok(true);
        response.setCode(200);
        response.setMessge("success");
        response.setData(obj);
        return response;
    }

    public static CustomResponse success(){
        CustomResponse response = new CustomResponse();
        response.setIsok(true);
        response.setCode(200);
        response.setMessge("success2");
        return response;
    }
}
