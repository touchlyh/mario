package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;
import org.yuanhong.li.bg.api.meta.InstituteDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface InstituteDAO {

    /**
     * 插入数据
     * @param InstituteDO
     * @return 插入数据的主键
     */
    public Long insertInstituteDO(InstituteDO InstituteDO);

    /**
     * 统计记录数
     * @param InstituteDO
     * @return 查出的记录数
     */
    public Integer countInstituteDOByExample(InstituteDO InstituteDO);

    /**
     * 更新记录
     * @param InstituteDO
     * @return 受影响的行数
     */
    public Integer updateInstituteDO(InstituteDO InstituteDO);

    /**
     * 获取对象列表
     * @param InstituteDO
     * @return 对象列表
     */
    public List<InstituteDO> findListByExample(InstituteDO InstituteDO);

    /**
     * 根据主键获取InstituteDO
     * @param id
     * @return InstituteDO
     */
    public InstituteDO findInstituteDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteInstituteDOByPrimaryKey(Long id);

}