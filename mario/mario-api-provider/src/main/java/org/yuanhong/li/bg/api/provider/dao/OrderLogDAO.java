package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;

import org.yuanhong.li.bg.api.meta.OrderLogDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface OrderLogDAO {

    /**
     * 插入数据
     * @param OrderLogDO
     * @return 插入数据的主键
     */
    public Long insertOrderLogDO(OrderLogDO OrderLogDO);

    /**
     * 统计记录数
     * @param OrderLogDO
     * @return 查出的记录数
     */
    public Integer countOrderLogDOByExample(OrderLogDO OrderLogDO);

    /**
     * 更新记录
     * @param OrderLogDO
     * @return 受影响的行数
     */
    public Integer updateOrderLogDO(OrderLogDO OrderLogDO);

    /**
     * 获取对象列表
     * @param OrderLogDO
     * @return 对象列表
     */
    public List<OrderLogDO> findListByExample(OrderLogDO OrderLogDO);

    /**
     * 根据主键获取OrderLogDO
     * @param id
     * @return OrderLogDO
     */
    public OrderLogDO findOrderLogDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteOrderLogDOByPrimaryKey(Long id);

}