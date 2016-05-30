package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.InstituteDO;
import org.yuanhong.li.bg.api.provider.dao.InstituteDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class InstituteDAOImpl extends SqlMapClientDaoSupport implements InstituteDAO {

    /**
     * 插入数据
     * @param bgInstituteDO
     * @return 插入数据的主键
     */
    public Long insertInstituteDO(InstituteDO bgInstituteDO) {
        Object id = getSqlMapClientTemplate().insert("Institute.insert", bgInstituteDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgInstituteDO
     * @return 查出的记录数
     */
    public Integer countInstituteDOByExample(InstituteDO bgInstituteDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("Institute.countByDOExample", bgInstituteDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgInstituteDO
     * @return 受影响的行数
     */
    public Integer updateInstituteDO(InstituteDO bgInstituteDO) {
        int result = getSqlMapClientTemplate().update("Institute.update", bgInstituteDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgInstituteDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<InstituteDO> findListByExample(InstituteDO bgInstituteDO) {
        List<InstituteDO> list = getSqlMapClientTemplate().queryForList("Institute.findListByDO", bgInstituteDO);
        return list;
    }

    /**
     * 根据主键获取bgInstituteDO
     * @param id
     * @return bgInstituteDO
     */
    public InstituteDO findInstituteDOByPrimaryKey(Long id) {
        InstituteDO bgInstituteDO = (InstituteDO) getSqlMapClientTemplate().queryForObject("Institute.findByPrimaryKey", id);
        return bgInstituteDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteInstituteDOByPrimaryKey(Long id) {
    	InstituteDO deleteDO = new InstituteDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateInstituteDO(deleteDO);
    }

}