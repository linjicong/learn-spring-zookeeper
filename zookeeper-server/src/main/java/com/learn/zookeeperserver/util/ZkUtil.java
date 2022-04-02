package com.learn.zookeeperserver.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linjicong
 * @date 2022-04-01 16:42
 */
@Component
@Slf4j
public class ZkUtil {

    @Autowired
    private CuratorFramework client;

    public String createNode(String path,String value) throws Exception {
        return createNode(path,value,true);
    }

    private String createNode(String path, String value, boolean isEphemeral) throws Exception {
        String node = client.create()
                .creatingParentsIfNeeded()
                .withMode(isEphemeral ? CreateMode.EPHEMERAL_SEQUENTIAL : CreateMode.PERSISTENT_SEQUENTIAL)
                .forPath(path, value.getBytes());
        log.info("create node : {}", node);
        return node;
    }

    public List<String> getNode(String path) throws Exception {
        return client.getChildren().forPath(path);
    }

    public void getAllNode(String path,Node node) throws Exception {
        List<String> nodes = getNode(path);
        node.setName(path);
        List<Node> children = new ArrayList<>();
        for (String s : nodes) {
            Node node1=new Node();
            children.add(node1);
            if(!path.equals("/")) {
                getAllNode(path + "/" + s, node1);
            }else{
                getAllNode(path + s, node1);
            }
        }
        node.setChildren(children);
    }

    @Data
    public static class Node {
        private String name;
        private List<Node> children;
    }
}
