package com.example.hibernate.Controller;
import com.example.hibernate.model.Autobus;
import com.example.hibernate.service.IAutobusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/buses")
public class AutoBusController {
    @Autowired
    IAutobusService bs;
    @GetMapping
    public ResponseEntity<List<Autobus>> listArtista(){
        Autobus b1 = new Autobus();
        b1.setMatricula("AAA 111");
        b1.setA_fabricacion(1999);
        Autobus b2 = new Autobus();
        b2.setMatricula("JFZ 222");
        b2.setA_fabricacion(2018);
        //creamos los 2 buses como filas
        bs.insertBus(b1);
        bs.insertBus(b2);
        return new ResponseEntity<>(bs.getAutobuses(), HttpStatus.OK);
    }
}
