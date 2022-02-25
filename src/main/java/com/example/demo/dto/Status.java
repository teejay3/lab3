package com.example.demo.dto;

public class Status {
    String hostName;
    public Status(String hostName)
    {
        this.hostName = hostName;
    }
    public String getHostname()
    {
        return this.hostName;
    }
    public void setHostName(String hostName)
    {
        this.hostName = hostName;
    }
}
