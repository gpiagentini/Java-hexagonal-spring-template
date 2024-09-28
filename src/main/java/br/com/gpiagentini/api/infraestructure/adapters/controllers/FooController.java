package br.com.gpiagentini.api.infraestructure.adapters.controllers;

import br.com.gpiagentini.api.application.port.in.IFooAppService;
import br.com.gpiagentini.api.infraestructure.dto.CreateFooData;
import br.com.gpiagentini.api.infraestructure.dto.FooRequestData;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("Foo")
@RequestMapping("/api/v1/foo")
public class FooController {

    private final IFooAppService fooAppService;

    public FooController(IFooAppService fooAppService) {
        this.fooAppService = fooAppService;
    }

    @PostMapping
    public void createFoo(@RequestBody @Valid CreateFooData createFooData) {
        fooAppService.createFoo(createFooData.description());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FooRequestData> getFoo(@PathVariable Long id) {
        var foo = fooAppService.getFooById(id);
        var fooRequestData = new FooRequestData(foo);
        return ResponseEntity.ok(fooRequestData);
    }

    @GetMapping
    public ResponseEntity<List<FooRequestData>> getAllFoo() {
        var fooList = fooAppService.getFooList();
        var fooRequestDataList = fooList.stream().map(FooRequestData::new).toList();
        return ResponseEntity.ok(fooRequestDataList);
    }
}
