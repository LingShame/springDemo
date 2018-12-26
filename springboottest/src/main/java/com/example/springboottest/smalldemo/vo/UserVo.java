package com.example.springboottest.smalldemo.vo;

import com.fasterxml.jackson.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @JsonIgnoreProperties:使用在类声明处,和@JsonIgnore的区别是可以对多个属性作用
 * 直接在value属性后面使用大括号逗号隔开, 属性ignoreUnknow为true表示忽略未定义的属性
 * @Auther: WangHuidong
 * @Date: 2018/12/25
 * @Description:
 */
//@JsonPropertyOrder对属性排序,属性alphabetic默认值是false,设置为true排序
@JsonPropertyOrder(alphabetic = true)
public class UserVo {

    //@JsonInclude:使用在某个属性上,配合Value=JsonInclude.Include.NON_NULL,
    //如果属性值为空,返回前端不可见
    @JsonInclude(value=JsonInclude.Include.NON_NULL)
    private String name;//姓名

    //@JsonIgnore:使用在某个属性上,序列化和反序列化忽略这个属性
    //最直接的效果就是返回的JSON属性是没有这个属性的,一般作用于密码这系列的属性
    @JsonIgnore
    private String password;//密码

    //@JsonFormat配合属性pattern标志事件格式,timezone是时区,local是区域
    //把日期格式化为String
    //前端的String格式需要解析为日期格式可以使用@DateTimeFormat
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss sss", locale = "AuthResources_zh_CN",timezone =
            "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss sss")
    private String birthday;//生日

    //@JsonProperty:使用在某个属性上,有两个作用
    //1.修改返回JSON数据的时候key值为value指定值
    //2.配合属性access=JsonProperty.Access.WRITE_ONLY只可进行序列化,不能反序列化
    //直观效果就是返回的数据没有该属性
    @JsonProperty(value="d",access = JsonProperty.Access.WRITE_ONLY)
    private String desc;//描述
}
