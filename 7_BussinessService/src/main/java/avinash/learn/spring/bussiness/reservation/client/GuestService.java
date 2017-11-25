package avinash.learn.spring.bussiness.reservation.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import avinash.learn.spring.bussiness.reservation.domain.Guest;

import java.util.Collections;
import java.util.List;

@FeignClient(value = "GUESTSERVICES", fallback = GuestServiceFallBackImpl.class)
public interface GuestService {

    @RequestMapping(value="/guests", method= RequestMethod.GET)
    List<Guest> findAll(@RequestParam(name="emailAddress", required = false)String emailAddress);

    @RequestMapping(value = "/guests/{id}", method = RequestMethod.GET)
    Guest findOne(@PathVariable(name="id")long id);
}
