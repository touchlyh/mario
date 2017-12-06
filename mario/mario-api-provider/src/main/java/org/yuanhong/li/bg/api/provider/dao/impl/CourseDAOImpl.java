package org.yuanhong.li.bg.api.provider.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.yuanhong.li.bg.api.meta.CourseDO;
import org.yuanhong.li.bg.api.provider.dao.CourseDAO;

/**
 * 数据访问对象实现类
 * @since 2016-05-27
 */
public class CourseDAOImpl extends SqlMapClientDaoSupport implements CourseDAO {

    /**
     * 插入数据
     * @param CourseDO
     * @return 插入数据的主键
     */
    public Long insertCourseDO(CourseDO CourseDO) {
        Object id = getSqlMapClientTemplate().insert("Course.insert", CourseDO);
        return (Long) id;
    }

    /**
     * 统计记录数
     * @param CourseDO
     * @return 查出的记录数
     */
    public Integer countCourseDOByExample(CourseDO CourseDO) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("Course.countByDOExample", CourseDO);
        return count;
    }

    /**
     * 更新记录
     * @param CourseDO
     * @return 受影响的行数
     */
    public Integer updateCourseDO(CourseDO CourseDO) {
        int result = getSqlMapClientTemplate().update("Course.update", CourseDO);
        return result;
    }

    /**
     * 获取对象列表
     * @param CourseDO
     * @return 对象列表
     */
    @SuppressWarnings("unchecked")
    public List<CourseDO> findListByExample(CourseDO CourseDO) {
        List<CourseDO> list = getSqlMapClientTemplate().queryForList("Course.findListByDO", CourseDO);
        return list;
    }

    /**
     * 根据主键获取CourseDO
     * @param id
     * @return CourseDO
     */
    public CourseDO findCourseDOByPrimaryKey(Long id) {
        CourseDO CourseDO = (CourseDO) getSqlMapClientTemplate().queryForObject("Course.findByPrimaryKey", id);
        return CourseDO;
    }

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deleteCourseDOByPrimaryKey(Long id) {
    	CourseDO deleteDO = new CourseDO();
    	deleteDO.setId(id);
    	deleteDO.setStatus(-1);
        return this.updateCourseDO(deleteDO);
    }

}