package com.f2m.apiController;

import com.f2m.model.FarmerRegistration;
import com.f2m.model.TraderRegistration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bakarali on 20/1/17.
 */
@RequestMapping("/register")
@RestController
public class FarmerRegistrationController {
    @RequestMapping(path = "/farmer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public FarmerRegistration getRegistration(@RequestBody FarmerRegistration body) {
        FarmerRegistration farmerRegistration = new FarmerRegistration();
        farmerRegistration.setId(body.getId());
        farmerRegistration.setName(body.getName());
        farmerRegistration.setPhone_no(body.getPhone_no());
        farmerRegistration.setPassword(body.getPassword());
        farmerRegistration.setAddress(body.getAddress());
        farmerRegistration.setImage_id(body.getImage_id());

        return farmerRegistration;
    }
}