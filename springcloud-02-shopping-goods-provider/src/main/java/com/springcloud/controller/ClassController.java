package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;
import com.springcloud.service.ClassService;
import com.springcloud.vo.ResultValue;

/**
 * 一级类别与二级类别的控制器
 * 
 * @author 万秀玲
 *
 */

@RestController
@RequestMapping("class")
public class ClassController {

	@Autowired
	private ClassService classService;

	/**
	 * 根据 一级类别编号查询相应二级类别
	 * 
	 * @return 成功返回java.util.List类型的实例，否则返回null
	 */
	@RequestMapping(value = "/selectAll")
	public ResultValue selectAll() {
		ResultValue rv = new ResultValue();
		try {
			// 调用service相应的方法查询所有一级类别的信息，并保存查询的结果
			List<Class1> list1 = this.classService.selectAllClass1();
			// 如果查询成功
			if (list1 != null && list1.size() > 0) {
				// 设置结果的状态为0
				rv.setCode(0);
				// 创建Map集合
				Map<String, Object> map = new HashMap<>();
				// 将查询结果存入Map中
				map.put("class1List", list1);
				// 将Map集合存入ResultValue对象中
				rv.setDataMap(map);
				// 返回ResultValue对象
				return rv;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		rv.setCode(1);
		return rv;
	}

	/**
	 * 根据 一级类别编号查询相应二级类别
	 * 
	 * @return 成功返回java.util.List类型的实例，否则返回null
	 */
	@RequestMapping(value = "/selectById")
	public ResultValue selectById(@RequestParam("class1Id") Integer class1Id) {
		ResultValue rv = new ResultValue();
		try {
			// 调用service相应的方法查询所有二级类别的信息，并保存查询的结果 ,list可以同名
			List<Class2> list2 = this.classService.selectClss2ByClss1Id(class1Id);
			// 如果查询成功
			if (list2 != null && list2.size() > 0) {
				// 设置结果的状态为0
				rv.setCode(0);
				// 创建Map集合
				Map<String, Object> map = new HashMap<>();
				// 将查询结果存入Map中
				map.put("class2List", list2);
				// 将Map集合存入ResultValue对象中
				rv.setDataMap(map);
				// 返回ResultValue对象
				return rv;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		rv.setCode(1);
		return rv;
	}

}
