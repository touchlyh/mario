package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;
import org.yuanhong.li.bg.api.meta.SpuDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface SpuDAO {

    /**
     * 插入数据
     * @param SpuDO
     * @return 插入数据的主键
     */
    public Long insertSpuDO(SpuDO SpuDO);

    /**
     * 统计记录数
     * @param SpuDO
     * @return 查出的记录数
     */
    public Integer countSpuDOByExample(SpuDO SpuDO);

    /**
     * 更新记录
     * @param SpuDO
     * @return 受影响的行数
     */
    public Integer updateSpuDO(SpuDO SpuDO);

    /**
     * 获取对象列表
     * @param SpuDO
     * @return 对象列表
     */
    public List<SpuDO> findListByExample(SpuDO SpuDO);

    /**
     * 根据主键获取SpuDO
     * @param id
     * @return SpuDO
     */
    public SpuDO findSpuDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteSpuDOByPrimaryKey(Long id);

}