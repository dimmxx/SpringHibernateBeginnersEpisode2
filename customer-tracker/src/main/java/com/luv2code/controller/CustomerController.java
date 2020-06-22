package com.luv2code.controller;

import com.luv2code.dao.CustomerDAO;
import com.luv2code.entity.Customer;
import com.luv2code.service.CustomerService;
import com.luv2code.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping ("/list")
    public String listCustomers(Model model){
        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }

    @GetMapping ("/showFormForAdd")
    public String addCustomer(Model model){
        Customer theCustomer = new Customer();
        model.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping ("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int customerId, Model model){
        Customer theCustomer = customerService.getCustomerById(customerId);
        model.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @GetMapping ("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") int customerId, Model model){
        Customer theCustomer = customerService.getCustomerById(customerId);
        model.addAttribute("customer", theCustomer);
        return "customer-form";
    }




}
