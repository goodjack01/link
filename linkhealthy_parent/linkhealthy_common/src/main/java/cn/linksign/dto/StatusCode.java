package cn.linksign.dto;

import java.io.Serializable;

public class StatusCode implements Serializable {

    public static final int OK = 20000; //成功
    public static final int ERROR = 20001; //系统异常或者一般性
    public static final int LOGIN_ERROR = 20002; //登录失败异常
    public static final int ACCESS_ERROR = 20003; //权限不足
    public static final int FORMAT_ERROR = 20004; // 用户输入格式错误
    public static final int NOT_EXIST_ERROR = 20005; //不存在或者未安装
    public static final int PARAMETER_ERROR = 20006; //参数类型错误

}
