package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.ProvinceDO;
import org.yuanhong.li.bg.api.provider.dao.ProvinceDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class ProvinceDAOImpl extends SqlMapClientDaoSupport implements ProvinceDAO {

    /**
     * 插入数据
     * @param bgProvinceDO
     * @return 插入数据的主键
     */
    public Long insertProvinceDO(ProvinceDO bgProvinceDO) {
        Object id = getSqlMapClientTemplate().insert("Province.insert", bgProvinceDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgProvinceDO
     * @return 查出的记录数
     */
    public Integer countProvinceDOByExample(ProvinceDO bgProvinceDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("Province.countByDOExample", bgProvinceDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgProvinceDO
     * @return 受影响的行数
     */
    public Integer updateProvinceDO(ProvinceDO bgProvinceDO) {
        int result = getSqlMapClientTemplate().update("Province.update", bgProvinceDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgProvinceDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<ProvinceDO> findListByExample(ProvinceDO bgProvinceDO) {
        List<ProvinceDO> list = getSqlMapClientTemplate().queryForList("Province.findListByDO", bgProvinceDO);
        return list;
    }

    /**
     * 根据主键获取bgProvinceDO
     * @param id
     * @return bgProvinceDO
     */
    public ProvinceDO findProvinceDOByPrimaryKey(Long id) {
        ProvinceDO bgProvinceDO = (ProvinceDO) getSqlMapClientTemplate().queryForObject("Province.findByPrimaryKey", id);
        return bgProvinceDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteProvinceDOByPrimaryKey(Long id) {
    	ProvinceDO province = new ProvinceDO();
    	province.setId(id);
    	province.setStatus(-1);
        return this.updateProvinceDO(province);
    }

}