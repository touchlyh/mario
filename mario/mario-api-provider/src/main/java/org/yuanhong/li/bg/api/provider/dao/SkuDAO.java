package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;
import org.yuanhong.li.bg.api.meta.SkuDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface SkuDAO {

    /**
     * 插入数据
     * @param SkuDO
     * @return 插入数据的主键
     */
    public Long insertSkuDO(SkuDO SkuDO);

    /**
     * 统计记录数
     * @param SkuDO
     * @return 查出的记录数
     */
    public Integer countSkuDOByExample(SkuDO SkuDO);

    /**
     * 更新记录
     * @param SkuDO
     * @return 受影响的行数
     */
    public Integer updateSkuDO(SkuDO SkuDO);

    /**
     * 获取对象列表
     * @param SkuDO
     * @return 对象列表
     */
    public List<SkuDO> findListByExample(SkuDO SkuDO);

    /**
     * 根据主键获取SkuDO
     * @param id
     * @return SkuDO
     */
    public SkuDO findSkuDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteSkuDOByPrimaryKey(Long id);

}