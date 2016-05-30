package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.UniversityDO;
import org.yuanhong.li.bg.api.provider.dao.UniversityDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class UniversityDAOImpl extends SqlMapClientDaoSupport implements UniversityDAO {

    /**
     * 插入数据
     * @param bgUniversityDO
     * @return 插入数据的主键
     */
    public Long insertUniversityDO(UniversityDO bgUniversityDO) {
        Object id = getSqlMapClientTemplate().insert("University.insert", bgUniversityDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgUniversityDO
     * @return 查出的记录数
     */
    public Integer countUniversityDOByExample(UniversityDO bgUniversityDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("University.countByDOExample", bgUniversityDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgUniversityDO
     * @return 受影响的行数
     */
    public Integer updateUniversityDO(UniversityDO bgUniversityDO) {
        int result = getSqlMapClientTemplate().update("University.update", bgUniversityDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgUniversityDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<UniversityDO> findListByExample(UniversityDO bgUniversityDO) {
        List<UniversityDO> list = getSqlMapClientTemplate().queryForList("University.findListByDO", bgUniversityDO);
        return list;
    }

    /**
     * 根据主键获取bgUniversityDO
     * @param id
     * @return bgUniversityDO
     */
    public UniversityDO findUniversityDOByPrimaryKey(Long id) {
        UniversityDO bgUniversityDO = (UniversityDO) getSqlMapClientTemplate().queryForObject("University.findByPrimaryKey", id);
        return bgUniversityDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteUniversityDOByPrimaryKey(Long id) {
    	UniversityDO deleteDO = new UniversityDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateUniversityDO(deleteDO);
    }

}