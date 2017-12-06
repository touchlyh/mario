package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;
import org.yuanhong.li.bg.api.meta.UserDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface UserDAO {

    /**
     * 插入数据
     * @param UserDO
     * @return 插入数据的主键
     */
    public Long insertUserDO(UserDO UserDO);

    /**
     * 统计记录数
     * @param UserDO
     * @return 查出的记录数
     */
    public Integer countUserDOByExample(UserDO UserDO);

    /**
     * 更新记录
     * @param UserDO
     * @return 受影响的行数
     */
    public Integer updateUserDO(UserDO UserDO);

    /**
     * 获取对象列表
     * @param UserDO
     * @return 对象列表
     */
    public List<UserDO> findListByExample(UserDO UserDO);

    /**
     * 根据主键获取UserDO
     * @param id
     * @return UserDO
     */
    public UserDO findUserDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteUserDOByPrimaryKey(Long id);

}