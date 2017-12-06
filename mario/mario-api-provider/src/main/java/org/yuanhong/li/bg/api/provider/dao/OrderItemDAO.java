package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;

import org.yuanhong.li.bg.api.meta.OrderItemDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface OrderItemDAO {

    /**
     * 插入数据
     * @param OrderItemDO
     * @return 插入数据的主键
     */
    public Long insertOrderItemDO(OrderItemDO OrderItemDO);

    /**
     * 统计记录数
     * @param OrderItemDO
     * @return 查出的记录数
     */
    public Integer countOrderItemDOByExample(OrderItemDO OrderItemDO);

    /**
     * 更新记录
     * @param OrderItemDO
     * @return 受影响的行数
     */
    public Integer updateOrderItemDO(OrderItemDO OrderItemDO);

    /**
     * 获取对象列表
     * @param OrderItemDO
     * @return 对象列表
     */
    public List<OrderItemDO> findListByExample(OrderItemDO OrderItemDO);

    /**
     * 根据主键获取OrderItemDO
     * @param id
     * @return OrderItemDO
     */
    public OrderItemDO findOrderItemDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteOrderItemDOByPrimaryKey(Long id);

}