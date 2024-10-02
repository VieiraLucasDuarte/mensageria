import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeControllerAPI{

    @Autowired
    private Map<String,DefaultService> services;


    @GetMapping
    public ResponseEntity<String> index() {
        String servicesList = null;
        if(services != null){
            Arrays.toString(services.keySet().ToArray())
        }
        return new ResponseEntity<String>(servicesList, HttpStatus.OK))
    }
}