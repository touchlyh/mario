package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;

import org.yuanhong.li.bg.api.meta.ProvinceDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface ProvinceDAO {

    /**
     * 插入数据
     * @param ProvinceDO
     * @return 插入数据的主键
     */
    public Long insertProvinceDO(ProvinceDO ProvinceDO);

    /**
     * 统计记录数
     * @param ProvinceDO
     * @return 查出的记录数
     */
    public Integer countProvinceDOByExample(ProvinceDO ProvinceDO);

    /**
     * 更新记录
     * @param ProvinceDO
     * @return 受影响的行数
     */
    public Integer updateProvinceDO(ProvinceDO ProvinceDO);

    /**
     * 获取对象列表
     * @param ProvinceDO
     * @return 对象列表
     */
    public List<ProvinceDO> findListByExample(ProvinceDO ProvinceDO);

    /**
     * 根据主键获取ProvinceDO
     * @param id
     * @return ProvinceDO
     */
    public ProvinceDO findProvinceDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteProvinceDOByPrimaryKey(Long id);

}