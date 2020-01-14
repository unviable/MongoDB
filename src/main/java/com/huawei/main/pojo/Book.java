package com.huawei.main.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author jacob peng
 * @Date 2020/1/14
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "jacob")
public class Book {
    @Id
    private String id;
    private Integer price;
    private String name;
    private String info;
    private String publish;
    private Date createTime;
    private Date updateTime;
}
