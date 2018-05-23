package com.xxbb.model;

public class FrameworkInfo {
    private Long id;

    private String mvcFramework;

    private String database;

    private String datasource;

    private String dataFramework;

    private String buildTool;

    private String logger;

    private String distributed;

    private String messageQueue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMvcFramework() {
        return mvcFramework;
    }

    public void setMvcFramework(String mvcFramework) {
        this.mvcFramework = mvcFramework;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getDataFramework() {
        return dataFramework;
    }

    public void setDataFramework(String dataFramework) {
        this.dataFramework = dataFramework;
    }

    public String getBuildTool() {
        return buildTool;
    }

    public void setBuildTool(String buildTool) {
        this.buildTool = buildTool;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    public String getDistributed() {
        return distributed;
    }

    public void setDistributed(String distributed) {
        this.distributed = distributed;
    }

    public String getMessageQueue() {
        return messageQueue;
    }

    public void setMessageQueue(String messageQueue) {
        this.messageQueue = messageQueue;
    }
}
