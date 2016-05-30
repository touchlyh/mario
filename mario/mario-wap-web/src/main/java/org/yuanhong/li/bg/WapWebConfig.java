/**
 * 
 */
package org.yuanhong.li.bg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yuanhong.li
 *
 */
@Configuration
@ImportResource({"classpath:beans/mvc-config.xml"})
@ComponentScan
public class WapWebConfig {

}
