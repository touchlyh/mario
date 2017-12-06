package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.UserDO;
import org.yuanhong.li.bg.api.provider.dao.UserDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO {

    /**
     * 插入数据
     * @param bgUserDO
     * @return 插入数据的主键
     */
    public Long insertUserDO(UserDO bgUserDO) {
        Object id = getSqlMapClientTemplate().insert("User.insert", bgUserDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgUserDO
     * @return 查出的记录数
     */
    public Integer countUserDOByExample(UserDO bgUserDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("User.countByDOExample", bgUserDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgUserDO
     * @return 受影响的行数
     */
    public Integer updateUserDO(UserDO bgUserDO) {
        int result = getSqlMapClientTemplate().update("User.update", bgUserDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgUserDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<UserDO> findListByExample(UserDO bgUserDO) {
        List<UserDO> list = getSqlMapClientTemplate().queryForList("User.findListByDO", bgUserDO);
        return list;
    }

    /**
     * 根据主键获取bgUserDO
     * @param id
     * @return bgUserDO
     */
    public UserDO findUserDOByPrimaryKey(Long id) {
        UserDO bgUserDO = (UserDO) getSqlMapClientTemplate().queryForObject("User.findByPrimaryKey", id);
        return bgUserDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteUserDOByPrimaryKey(Long id) {
    	UserDO deleteDO = new UserDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateUserDO(deleteDO);
    }

}