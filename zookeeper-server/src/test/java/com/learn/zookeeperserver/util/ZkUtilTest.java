package com.learn.zookeeperserver.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZkUtilTest {
    @Autowired
    private ZkUtil zkUtil;

    @Test
    void getNode() throws Exception {
        ZkUtil.Node node = new ZkUtil.Node();
        zkUtil.getAllNode("/",node);
        System.out.println(node);
    }
}
