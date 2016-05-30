package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.ShipAddressDO;
import org.yuanhong.li.bg.api.provider.dao.ShipAddressDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class ShipAddressDAOImpl extends SqlMapClientDaoSupport implements ShipAddressDAO {

    /**
     * 插入数据
     * @param bgShipAddressDO
     * @return 插入数据的主键
     */
    public Long insertShipAddressDO(ShipAddressDO bgShipAddressDO) {
        Object id = getSqlMapClientTemplate().insert("ShipAddress.insert", bgShipAddressDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param bgShipAddressDO
     * @return 查出的记录数
     */
    public Integer countShipAddressDOByExample(ShipAddressDO bgShipAddressDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("ShipAddress.countByDOExample", bgShipAddressDO);
        return count;
    }

    /**
     * 更新记录
     * @param bgShipAddressDO
     * @return 受影响的行数
     */
    public Integer updateShipAddressDO(ShipAddressDO bgShipAddressDO) {
        int result = getSqlMapClientTemplate().update("ShipAddress.update", bgShipAddressDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param bgShipAddressDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<ShipAddressDO> findListByExample(ShipAddressDO bgShipAddressDO) {
        List<ShipAddressDO> list = getSqlMapClientTemplate().queryForList("ShipAddress.findListByDO", bgShipAddressDO);
        return list;
    }

    /**
     * 根据主键获取bgShipAddressDO
     * @param id
     * @return bgShipAddressDO
     */
    public ShipAddressDO findShipAddressDOByPrimaryKey(Long id) {
        ShipAddressDO bgShipAddressDO = (ShipAddressDO) getSqlMapClientTemplate().queryForObject("ShipAddress.findByPrimaryKey", id);
        return bgShipAddressDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteShipAddressDOByPrimaryKey(Long id) {
    	ShipAddressDO deleteDO = new ShipAddressDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
    	return this.updateShipAddressDO(deleteDO);
    }

}