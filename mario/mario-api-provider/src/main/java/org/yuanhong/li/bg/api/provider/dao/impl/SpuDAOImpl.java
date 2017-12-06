package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.SpuDO;
import org.yuanhong.li.bg.api.provider.dao.SpuDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class SpuDAOImpl extends SqlMapClientDaoSupport implements SpuDAO {

    /**
     * 插入数据
     * @param bgSpuDO
     * @return 插入数据的主键
     */
    public Long insertSpuDO(SpuDO bgSpuDO) {
        Object id = getSqlMapClientTemplate().insert("Spu.insert", bgSpuDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgSpuDO
     * @return 查出的记录数
     */
    public Integer countSpuDOByExample(SpuDO bgSpuDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("Spu.countByDOExample", bgSpuDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgSpuDO
     * @return 受影响的行数
     */
    public Integer updateSpuDO(SpuDO bgSpuDO) {
        int result = getSqlMapClientTemplate().update("Spu.update", bgSpuDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgSpuDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<SpuDO> findListByExample(SpuDO bgSpuDO) {
        List<SpuDO> list = getSqlMapClientTemplate().queryForList("Spu.findListByDO", bgSpuDO);
        return list;
    }

    /**
     * 根据主键获取bgSpuDO
     * @param id
     * @return bgSpuDO
     */
    public SpuDO findSpuDOByPrimaryKey(Long id) {
        SpuDO bgSpuDO = (SpuDO) getSqlMapClientTemplate().queryForObject("Spu.findByPrimaryKey", id);
        return bgSpuDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteSpuDOByPrimaryKey(Long id) {
    	SpuDO deleteDO = new SpuDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateSpuDO(deleteDO);
    }

}