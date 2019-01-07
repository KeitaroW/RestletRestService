/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keitarow.timetracking;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

/**
 *
 * @author Benedikt
 */
public interface IEmployeesResource {
    @Get
    public Employees retrieve();
    
    @Post
    public Employees store(Employee emp);
}
