package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.OrderItemDO;
import org.yuanhong.li.bg.api.provider.dao.OrderItemDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class OrderItemDAOImpl extends SqlMapClientDaoSupport implements OrderItemDAO {

    /**
     * 插入数据
     * @param bgOrderItemDO
     * @return 插入数据的主键
     */
    public Long insertOrderItemDO(OrderItemDO bgOrderItemDO) {
        Object id = getSqlMapClientTemplate().insert("OrderItem.insert", bgOrderItemDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgOrderItemDO
     * @return 查出的记录数
     */
    public Integer countOrderItemDOByExample(OrderItemDO bgOrderItemDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("OrderItem.countByDOExample", bgOrderItemDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgOrderItemDO
     * @return 受影响的行数
     */
    public Integer updateOrderItemDO(OrderItemDO bgOrderItemDO) {
        int result = getSqlMapClientTemplate().update("OrderItem.update", bgOrderItemDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgOrderItemDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<OrderItemDO> findListByExample(OrderItemDO bgOrderItemDO) {
        List<OrderItemDO> list = getSqlMapClientTemplate().queryForList("OrderItem.findListByDO", bgOrderItemDO);
        return list;
    }

    /**
     * 根据主键获取bgOrderItemDO
     * @param id
     * @return bgOrderItemDO
     */
    public OrderItemDO findOrderItemDOByPrimaryKey(Long id) {
        OrderItemDO bgOrderItemDO = (OrderItemDO) getSqlMapClientTemplate().queryForObject("OrderItem.findByPrimaryKey", id);
        return bgOrderItemDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteOrderItemDOByPrimaryKey(Long id) {
    	OrderItemDO deleteDO = new OrderItemDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateOrderItemDO(deleteDO);
    }

}