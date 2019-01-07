/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keitarow.timetracking;

import java.util.List;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

/**
 *
 * @author Benedikt
 */
public interface IEmployeeResource {
    
    @Get
    public Employee retrieve();
    
    @Put
    public Employee edit(Employee emp);
}
