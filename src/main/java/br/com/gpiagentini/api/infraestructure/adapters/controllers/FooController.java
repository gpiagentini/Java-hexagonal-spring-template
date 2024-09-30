package br.com.gpiagentini.api.infraestructure.adapters.controllers;

import br.com.gpiagentini.api.application.port.in.IFooAppService;
import br.com.gpiagentini.api.infraestructure.dto.CreateFooData;
import br.com.gpiagentini.api.infraestructure.dto.FooRequestData;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Validated
@RestController("Foo")
@RequestMapping("/api/v1/foo")
public class FooController {

    private final IFooAppService fooAppService;

    public FooController(IFooAppService fooAppService) {
        this.fooAppService = fooAppService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<FooRequestData> createFoo(@RequestBody @Valid CreateFooData createFooData, UriComponentsBuilder uriBuilder) {
        var foo = fooAppService.createFoo(createFooData.description());
        var uri = uriBuilder.path("/api/v1/{id}").buildAndExpand(foo.getDescription()).toUri();
        return ResponseEntity.created(uri).body(new FooRequestData(foo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FooRequestData> getFoo(@Positive(message = "Id must be greater than 0.") @PathVariable Long id) {
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
