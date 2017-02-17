package com.dev;

import com.dev.domain.Customer;
import com.dev.service.CustomerService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    CustomerService customerService = new CustomerService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getIt() {
        return customerService.getAll();
    }

}
