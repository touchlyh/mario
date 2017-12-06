package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.CartItemDO;
import org.yuanhong.li.bg.api.provider.dao.CartItemDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class CartItemDAOImpl extends SqlMapClientDaoSupport implements CartItemDAO {

    /**
     * 插入数据
     * @param CartItemDO
     * @return 插入数据的主键
     */
    public Long insertCartItemDO(CartItemDO CartItemDO) {
        Object id = getSqlMapClientTemplate().insert("CartItem.insert", CartItemDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param CartItemDO
     * @return 查出的记录数
     */
    public Integer countCartItemDOByExample(CartItemDO CartItemDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("CartItem.countByDOExample", CartItemDO);
        return count;
    }

    /**
     * 更新记录
     * @param CartItemDO
     * @return 受影响的行数
     */
    public Integer updateCartItemDO(CartItemDO CartItemDO) {
        int result = getSqlMapClientTemplate().update("CartItem.update", CartItemDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param CartItemDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<CartItemDO> findListByExample(CartItemDO CartItemDO) {
        List<CartItemDO> list = getSqlMapClientTemplate().queryForList("CartItem.findListByDO", CartItemDO);
        return list;
    }

    /**
     * 根据主键获取CartItemDO
     * @param id
     * @return CartItemDO
     */
    public CartItemDO findCartItemDOByPrimaryKey(Long id) {
        CartItemDO CartItemDO = (CartItemDO) getSqlMapClientTemplate().queryForObject("CartItem.findByPrimaryKey", id);
        return CartItemDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteCartItemDOByPrimaryKey(Long id) {
    	CartItemDO cartItemDO = new CartItemDO();
    	cartItemDO.setId(id);
    	cartItemDO.setStatus(-1);
        return this.updateCartItemDO(cartItemDO);
    }

}