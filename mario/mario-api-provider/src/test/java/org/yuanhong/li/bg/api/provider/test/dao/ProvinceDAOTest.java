package org.yuanhong.li.bg.api.provider.test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.yuanhong.li.bg.api.meta.ProvinceDO;
import org.yuanhong.li.bg.api.provider.dao.ProvinceDAO;
import org.yuanhong.li.bg.api.provider.test.DAOJunitSuperClass;

/**
 * 
 * @author yuanhong.li
 *
 */
public class ProvinceDAOTest extends DAOJunitSuperClass{

	@Resource
	private ProvinceDAO provinceDAO;
	
	@Test
	public void test_S_checkBean(){
		Assert.assertNotNull(provinceDAO);
	}
	
	@Test
	public void test_S_insert(){
		ProvinceDO province = new ProvinceDO();
		province.setName("北京");
		province.setStatus(0);
		provinceDAO.insertProvinceDO(province);
	}
	
	@Test
	public void test_S_query(){
		ProvinceDO province = new ProvinceDO();
		province.setName("北京");
		List<ProvinceDO> provinceList = provinceDAO.findListByExample(province);
		System.out.println(provinceList);
	}
	
	@Test
	public void test_S_update() {
		ProvinceDO province = new ProvinceDO();
		province.setId(1L);
		province.setName("北京");
		Integer count = provinceDAO.updateProvinceDO(province);
		System.out.println(count);
	}
	
	@Test
	public void test_S_delete() {
		Long id = 1L;
		Integer count = provinceDAO.deleteProvinceDOByPrimaryKey(id);
		System.out.println(count);
	}
}
