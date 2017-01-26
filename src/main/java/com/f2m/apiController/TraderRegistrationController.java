package com.f2m.apiController;

import com.f2m.model.TraderRegistration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/register")
@RestController
public class TraderRegistrationController {

    @RequestMapping(path = "/trader", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public TraderRegistration getRegistration(@RequestBody TraderRegistration body){
        TraderRegistration registration = new TraderRegistration();
        registration.setName(body.getName());
        registration.setId(body.getId());
        registration.setEmail(body.getEmail());
        registration.setPassword(body.getPassword());
        registration.setPhone_no(body.getPhone_no());
        registration.setCompany(body.getCompany());
        registration.setAddress(body.getAddress());
        registration.setImage_id(body.getImage_id());
        return registration;
    }

}
