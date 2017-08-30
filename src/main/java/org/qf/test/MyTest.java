package org.qf.test;


import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 33295 on 2017/8/29.
 */
public class MyTest {

    @Test
    public void  test1() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> list = new ArrayList<String>();
        File f = new File(this.getClass().getResource("/").getPath());
        System.err.println(f);
        File file = new File("src/main/resources/generatorConfig.xml");





        ConfigurationParser parser = new ConfigurationParser(list);
        Configuration configuration = parser.parseConfiguration(file);

        boolean overwrite=true;
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);



        MyBatisGenerator generator = new MyBatisGenerator(configuration, callback, list);
        generator.generate(null);
    }
    }

