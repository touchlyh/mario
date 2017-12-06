package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;
import org.yuanhong.li.bg.api.meta.ShipAddressDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface ShipAddressDAO {

    /**
     * 插入数据
     * @param ShipAddressDO
     * @return 插入数据的主键
     */
    public Long insertShipAddressDO(ShipAddressDO ShipAddressDO);

    /**
     * 统计记录数
     * @param ShipAddressDO
     * @return 查出的记录数
     */
    public Integer countShipAddressDOByExample(ShipAddressDO ShipAddressDO);

    /**
     * 更新记录
     * @param ShipAddressDO
     * @return 受影响的行数
     */
    public Integer updateShipAddressDO(ShipAddressDO ShipAddressDO);

    /**
     * 获取对象列表
     * @param ShipAddressDO
     * @return 对象列表
     */
    public List<ShipAddressDO> findListByExample(ShipAddressDO ShipAddressDO);

    /**
     * 根据主键获取ShipAddressDO
     * @param id
     * @return ShipAddressDO
     */
    public ShipAddressDO findShipAddressDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteShipAddressDOByPrimaryKey(Long id);

}