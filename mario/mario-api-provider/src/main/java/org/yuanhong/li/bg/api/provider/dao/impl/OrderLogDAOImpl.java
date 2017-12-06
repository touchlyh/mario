package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.OrderLogDO;
import org.yuanhong.li.bg.api.provider.dao.OrderLogDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class OrderLogDAOImpl extends SqlMapClientDaoSupport implements OrderLogDAO {

    /**
     * 插入数据
     * @param bgOrderLogDO
     * @return 插入数据的主键
     */
    public Long insertOrderLogDO(OrderLogDO bgOrderLogDO) {
        Object id = getSqlMapClientTemplate().insert("OrderLog.insert", bgOrderLogDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgOrderLogDO
     * @return 查出的记录数
     */
    public Integer countOrderLogDOByExample(OrderLogDO bgOrderLogDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("OrderLog.countByDOExample", bgOrderLogDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgOrderLogDO
     * @return 受影响的行数
     */
    public Integer updateOrderLogDO(OrderLogDO bgOrderLogDO) {
        int result = getSqlMapClientTemplate().update("OrderLog.update", bgOrderLogDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgOrderLogDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<OrderLogDO> findListByExample(OrderLogDO bgOrderLogDO) {
        List<OrderLogDO> list = getSqlMapClientTemplate().queryForList("OrderLog.findListByDO", bgOrderLogDO);
        return list;
    }

    /**
     * 根据主键获取bgOrderLogDO
     * @param id
     * @return bgOrderLogDO
     */
    public OrderLogDO findOrderLogDOByPrimaryKey(Long id) {
        OrderLogDO bgOrderLogDO = (OrderLogDO) getSqlMapClientTemplate().queryForObject("OrderLog.findByPrimaryKey", id);
        return bgOrderLogDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteOrderLogDOByPrimaryKey(Long id) {
    	OrderLogDO deleteDO = new OrderLogDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateOrderLogDO(deleteDO);
    }

}