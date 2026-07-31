package com.codealpha;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("CodeAlpha DevOps Internship - Task 3");
        System.out.println("Automated Java Application Build via Gradle");
        System.out.println("=========================================");

        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<String, String> statusMap = new HashMap<>();
            statusMap.put("status", "SUCCESS");
            statusMap.put("message", "Gradle Build & Dependency Injection Verified!");

            String jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(statusMap);
            System.out.println("Runtime Status Output:");
            System.out.println(jsonOutput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}