package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.PayRecordDO;
import org.yuanhong.li.bg.api.provider.dao.PayRecordDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class PayRecordDAOImpl extends SqlMapClientDaoSupport implements PayRecordDAO {

    /**
     * 插入数据
     * @param bgPayRecordDO
     * @return 插入数据的主键
     */
    public Long insertPayRecordDO(PayRecordDO bgPayRecordDO) {
        Object id = getSqlMapClientTemplate().insert("PayRecord.insert", bgPayRecordDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgPayRecordDO
     * @return 查出的记录数
     */
    public Integer countPayRecordDOByExample(PayRecordDO bgPayRecordDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("PayRecord.countByDOExample", bgPayRecordDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgPayRecordDO
     * @return 受影响的行数
     */
    public Integer updatePayRecordDO(PayRecordDO bgPayRecordDO) {
        int result = getSqlMapClientTemplate().update("PayRecord.update", bgPayRecordDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgPayRecordDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<PayRecordDO> findListByExample(PayRecordDO bgPayRecordDO) {
        List<PayRecordDO> list = getSqlMapClientTemplate().queryForList("PayRecord.findListByDO", bgPayRecordDO);
        return list;
    }

    /**
     * 根据主键获取bgPayRecordDO
     * @param id
     * @return bgPayRecordDO
     */
    public PayRecordDO findPayRecordDOByPrimaryKey(Long id) {
        PayRecordDO bgPayRecordDO = (PayRecordDO) getSqlMapClientTemplate().queryForObject("PayRecord.findByPrimaryKey", id);
        return bgPayRecordDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deletePayRecordDOByPrimaryKey(Long id) {
    	PayRecordDO deleteDO = new PayRecordDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updatePayRecordDO(deleteDO);
    }

}