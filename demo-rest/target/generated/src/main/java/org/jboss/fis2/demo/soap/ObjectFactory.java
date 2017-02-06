
package org.jboss.fis2.demo.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jboss.fis2.demo.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.fis2.demo.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link EmployeeList }
     * 
     */
    public EmployeeList createEmployeeList() {
        return new EmployeeList();
    }

    /**
     * Create an instance of {@link GetEmployeeList }
     * 
     */
    public GetEmployeeList createGetEmployeeList() {
        return new GetEmployeeList();
    }

    /**
     * Create an instance of {@link GetEmployeeListResponse }
     * 
     */
    public GetEmployeeListResponse createGetEmployeeListResponse() {
        return new GetEmployeeListResponse();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link AddEmployeeBulk }
     * 
     */
    public AddEmployeeBulk createAddEmployeeBulk() {
        return new AddEmployeeBulk();
    }

    /**
     * Create an instance of {@link AddEmployeeBulkResponse }
     * 
     */
    public AddEmployeeBulkResponse createAddEmployeeBulkResponse() {
        return new AddEmployeeBulkResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeAll }
     * 
     */
    public GetEmployeeAll createGetEmployeeAll() {
        return new GetEmployeeAll();
    }

    /**
     * Create an instance of {@link GetEmployeeAllResponse }
     * 
     */
    public GetEmployeeAllResponse createGetEmployeeAllResponse() {
        return new GetEmployeeAllResponse();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

}
