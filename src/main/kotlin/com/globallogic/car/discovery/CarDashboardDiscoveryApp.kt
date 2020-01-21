package com.globallogic.car.discovery

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer


@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
class CarDashboardDiscoveryApp

fun main() {
    SpringApplication.run(CarDashboardDiscoveryApp::class.java)
}