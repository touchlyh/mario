package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.OrderDO;
import org.yuanhong.li.bg.api.provider.dao.OrderDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class OrderDAOImpl extends SqlMapClientDaoSupport implements OrderDAO {

    /**
     * 插入数据
     * @param bgOrderDO
     * @return 插入数据的主键
     */
    public Long insertOrderDO(OrderDO bgOrderDO) {
        Object id = getSqlMapClientTemplate().insert("Order.insert", bgOrderDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgOrderDO
     * @return 查出的记录数
     */
    public Integer countOrderDOByExample(OrderDO bgOrderDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("Order.countByDOExample", bgOrderDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgOrderDO
     * @return 受影响的行数
     */
    public Integer updateOrderDO(OrderDO bgOrderDO) {
        int result = getSqlMapClientTemplate().update("Order.update", bgOrderDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgOrderDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<OrderDO> findListByExample(OrderDO bgOrderDO) {
        List<OrderDO> list = getSqlMapClientTemplate().queryForList("Order.findListByDO", bgOrderDO);
        return list;
    }

    /**
     * 根据主键获取bgOrderDO
     * @param id
     * @return bgOrderDO
     */
    public OrderDO findOrderDOByPrimaryKey(Long id) {
        OrderDO bgOrderDO = (OrderDO) getSqlMapClientTemplate().queryForObject("Order.findByPrimaryKey", id);
        return bgOrderDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteOrderDOByPrimaryKey(Long id) {
    	OrderDO deleteDO = new OrderDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateOrderDO(deleteDO);
    }

}