package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;
import org.yuanhong.li.bg.api.meta.UniversityDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface UniversityDAO {

    /**
     * 插入数据
     * @param UniversityDO
     * @return 插入数据的主键
     */
    public Long insertUniversityDO(UniversityDO UniversityDO);

    /**
     * 统计记录数
     * @param UniversityDO
     * @return 查出的记录数
     */
    public Integer countUniversityDOByExample(UniversityDO UniversityDO);

    /**
     * 更新记录
     * @param UniversityDO
     * @return 受影响的行数
     */
    public Integer updateUniversityDO(UniversityDO UniversityDO);

    /**
     * 获取对象列表
     * @param UniversityDO
     * @return 对象列表
     */
    public List<UniversityDO> findListByExample(UniversityDO UniversityDO);

    /**
     * 根据主键获取UniversityDO
     * @param id
     * @return UniversityDO
     */
    public UniversityDO findUniversityDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteUniversityDOByPrimaryKey(Long id);

}