package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.SkuDO;
import org.yuanhong.li.bg.api.provider.dao.SkuDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class SkuDAOImpl extends SqlMapClientDaoSupport implements SkuDAO {

    /**
     * 插入数据
     * @param bgSkuDO
     * @return 插入数据的主键
     */
    public Long insertSkuDO(SkuDO bgSkuDO) {
        Object id = getSqlMapClientTemplate().insert("Sku.insert", bgSkuDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgSkuDO
     * @return 查出的记录数
     */
    public Integer countSkuDOByExample(SkuDO bgSkuDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("Sku.countByDOExample", bgSkuDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgSkuDO
     * @return 受影响的行数
     */
    public Integer updateSkuDO(SkuDO bgSkuDO) {
        int result = getSqlMapClientTemplate().update("Sku.update", bgSkuDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgSkuDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<SkuDO> findListByExample(SkuDO bgSkuDO) {
        List<SkuDO> list = getSqlMapClientTemplate().queryForList("Sku.findListByDO", bgSkuDO);
        return list;
    }

    /**
     * 根据主键获取bgSkuDO
     * @param id
     * @return bgSkuDO
     */
    public SkuDO findSkuDOByPrimaryKey(Long id) {
        SkuDO bgSkuDO = (SkuDO) getSqlMapClientTemplate().queryForObject("Sku.findByPrimaryKey", id);
        return bgSkuDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteSkuDOByPrimaryKey(Long id) {
    	SkuDO deleteDO = new SkuDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateSkuDO(deleteDO);
    }

}