/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfcoaching.SpringRestApi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Chris
 */

@RestController
@RequestMapping("/api")
public class RestApiController {
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
}
