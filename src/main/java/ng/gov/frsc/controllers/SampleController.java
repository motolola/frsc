package ng.gov.frsc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ng.gov.frsc.models.Sample;
import ng.gov.frsc.services.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleController extends CrudController<Sample, SampleService> {
    
    @Autowired
    @Override
    public void setService(SampleService service) {
        this.service = service;
    }

    @Override
    public Boolean isAuthorized(Long entityId, SampleService service) {
        return true;
    }
}
