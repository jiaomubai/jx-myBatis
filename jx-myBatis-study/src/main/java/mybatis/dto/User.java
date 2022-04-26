package mybatis.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Author: jiaoxian
 * @Date: 2022/3/29 15:24
 * @Description:
 */
@Data
public class User implements Serializable {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

}
