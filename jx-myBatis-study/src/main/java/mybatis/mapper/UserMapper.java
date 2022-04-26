package mybatis.mapper;

import mybatis.dto.User;

/**
 * @ClassName: UserMapper
 * @Author: jiaoxian
 * @Date: 2022/3/29 15:47
 * @Description:
 */
public interface UserMapper {

    /*
     * MyBatis 面向接口编程的两个一致
     * 1.映射文件的 namespace 要和 mapper 接口的全类名保持一致
     * 2.映射文件中的 sql 语句的 id 要和 mapper 接口中的方法名保持一致
     **/

    /**
     * 根据主键id获取用户信息
     * @param id
     * @return
     */
    User selectUserById(Long id);

    /**
     * 新增用户
     * @param user
     * @return
     */
    int insertUser(User user);

}
