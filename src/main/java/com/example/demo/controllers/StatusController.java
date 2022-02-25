package com.example.demo.controllers;
import com.example.demo.dto.Status;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = StatusController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class StatusController
{
    public static final String REST_URL = "/api/v1/status";

    @GetMapping
    public Status getHostname() throws UnknownHostException
    {
        return new Status(InetAddress.getLocalHost().getHostName());
    }
}
