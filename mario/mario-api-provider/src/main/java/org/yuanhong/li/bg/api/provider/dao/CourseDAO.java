package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;

import org.yuanhong.li.bg.api.meta.CourseDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface CourseDAO {

    /**
     * 插入数据
     * @param CourseDO
     * @return 插入数据的主键
     */
    public Long insertCourseDO(CourseDO CourseDO);

    /**
     * 统计记录数
     * @param CourseDO
     * @return 查出的记录数
     */
    public Integer countCourseDOByExample(CourseDO CourseDO);

    /**
     * 更新记录
     * @param CourseDO
     * @return 受影响的行数
     */
    public Integer updateCourseDO(CourseDO CourseDO);

    /**
     * 获取对象列表
     * @param CourseDO
     * @return 对象列表
     */
    public List<CourseDO> findListByExample(CourseDO CourseDO);

    /**
     * 根据主键获取CourseDO
     * @param id
     * @return CourseDO
     */
    public CourseDO findCourseDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteCourseDOByPrimaryKey(Long id);

}