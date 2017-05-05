package org.smart4j.framework.helper;

import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropertiesUtil;

import java.util.Properties;

/**
 * 属性文件助手类
 */
public final class ConfigHelper {

    private static final Properties CONFIG_PROPS = PropertiesUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC 驱动
     */
    public static String getJdbcDriver() {
        return PropertiesUtil.findPropertiesKey(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取JDBC URL
     */
    public static String getJdbcUrl() {
        return PropertiesUtil.findPropertiesKey(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }

    /**
     * 获取JDBC 用户名
     */
    public static String getJdbcUsername() {
        return PropertiesUtil.findPropertiesKey(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取JDBC 密码
     */
    public static String getJdbcPassword() {
        return PropertiesUtil.findPropertiesKey(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }

    /**
     *获取应用基础包名
     */
    public static String getAppBasePackage() {
        return PropertiesUtil.findPropertiesKey(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     *获取应用 JSP路径
     */
    public static String getAppJspPath() {
        return PropertiesUtil.findPropertiesKey(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * 获取应用静态资源路径
     */
    public static String getAppAssetPath() {
        return PropertiesUtil.findPropertiesKey(CONFIG_PROPS, ConfigConstant.APP_ASSET_PATH, "/asset/");
    }
}
