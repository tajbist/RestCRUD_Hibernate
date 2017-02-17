package com.dev;

import com.dev.domain.Customer;
import com.dev.service.CustomerService;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/customer")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    CustomerService customerService = new CustomerService();

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getIt() {
        return customerService.getAll();
    }

    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void add(@FormParam("cname") String name,
                    @FormParam("email") String email,
                    @FormParam("phone") String phone,
                    @Context HttpServletResponse servletResponse) throws IOException {
        Customer customer = new Customer(name, email, phone);
        customerService.save(customer);
        System.out.println(customer.toString());
        servletResponse.sendRedirect("./all");


    }
}