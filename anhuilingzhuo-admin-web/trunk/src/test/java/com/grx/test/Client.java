package com.grx.test;

import org.mybatis.generator.ant.utils.GeneratorUtils;

import java.io.File;
import java.net.URL;

/**
 * 
 * 自动生成MyBatismapper文件
 * 
 * @author Administrator
 *
 */
public class Client {

	/***
	 * 
	 * 代码生成完成之后，放在src下面
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		GeneratorUtils.generator("java/generatorConfig-run.xml");

//		String configFile = "java/generatorConfig-run.xml";
//		URL url = GeneratorUtils.class.getClassLoader().getResource(configFile);
//		System.out.println(url);
//
		File f = new File("/D:/%e7%8e%b0%e9%87%91%e5%8f%a3%e8%b4%b7/anhuilingzhuo-admin-web/trunk/target/classes/java/readme.txt");
//
		System.out.println(f.exists());
	}
}
