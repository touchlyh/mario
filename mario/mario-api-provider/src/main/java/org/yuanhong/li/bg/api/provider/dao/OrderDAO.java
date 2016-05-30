package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;

import org.yuanhong.li.bg.api.meta.OrderDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface OrderDAO {

    /**
     * 插入数据
     * @param OrderDO
     * @return 插入数据的主键
     */
    public Long insertOrderDO(OrderDO OrderDO);

    /**
     * 统计记录数
     * @param OrderDO
     * @return 查出的记录数
     */
    public Integer countOrderDOByExample(OrderDO OrderDO);

    /**
     * 更新记录
     * @param OrderDO
     * @return 受影响的行数
     */
    public Integer updateOrderDO(OrderDO OrderDO);

    /**
     * 获取对象列表
     * @param OrderDO
     * @return 对象列表
     */
    public List<OrderDO> findListByExample(OrderDO OrderDO);

    /**
     * 根据主键获取OrderDO
     * @param id
     * @return OrderDO
     */
    public OrderDO findOrderDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteOrderDOByPrimaryKey(Long id);

}