package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;

import org.yuanhong.li.bg.api.meta.CartItemDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface CartItemDAO {

    /**
     * 插入数据
     * @param CartItemDO
     * @return 插入数据的主键
     */
    public Long insertCartItemDO(CartItemDO CartItemDO);

    /**
     * 统计记录数
     * @param CartItemDO
     * @return 查出的记录数
     */
    public Integer countCartItemDOByExample(CartItemDO CartItemDO);

    /**
     * 更新记录
     * @param CartItemDO
     * @return 受影响的行数
     */
    public Integer updateCartItemDO(CartItemDO CartItemDO);

    /**
     * 获取对象列表
     * @param CartItemDO
     * @return 对象列表
     */
    public List<CartItemDO> findListByExample(CartItemDO CartItemDO);

    /**
     * 根据主键获取CartItemDO
     * @param id
     * @return CartItemDO
     */
    public CartItemDO findCartItemDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteCartItemDOByPrimaryKey(Long id);

}