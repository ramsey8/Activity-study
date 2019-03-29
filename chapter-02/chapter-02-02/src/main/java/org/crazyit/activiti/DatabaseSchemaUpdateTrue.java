package org.crazyit.activiti;

import org.activiti.engine.ProcessEngineConfiguration;

public class DatabaseSchemaUpdateTrue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//读取Activiti配置
		ProcessEngineConfiguration config = ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("schemaUpdate-true.xml");
		//启动Activiti
		config.buildProcessEngine();
	}

}
