package org.yuanhong.li.bg.api.provider.dao;

import java.util.List;

import org.yuanhong.li.bg.api.meta.PayRecordDO;

/**
 * 数据访问对象接口
 * @since 2016-05-27
 */
public interface PayRecordDAO {

    /**
     * 插入数据
     * @param PayRecordDO
     * @return 插入数据的主键
     */
    public Long insertPayRecordDO(PayRecordDO PayRecordDO);

    /**
     * 统计记录数
     * @param PayRecordDO
     * @return 查出的记录数
     */
    public Integer countPayRecordDOByExample(PayRecordDO PayRecordDO);

    /**
     * 更新记录
     * @param PayRecordDO
     * @return 受影响的行数
     */
    public Integer updatePayRecordDO(PayRecordDO PayRecordDO);

    /**
     * 获取对象列表
     * @param PayRecordDO
     * @return 对象列表
     */
    public List<PayRecordDO> findListByExample(PayRecordDO PayRecordDO);

    /**
     * 根据主键获取PayRecordDO
     * @param id
     * @return PayRecordDO
     */
    public PayRecordDO findPayRecordDOByPrimaryKey(Long id);

    /**
     * 删除记录
     * @param id
     * @return 受影响的行数
     */
    public Integer deletePayRecordDOByPrimaryKey(Long id);

}