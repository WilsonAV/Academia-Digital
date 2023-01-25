package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl matriculaServiceImp;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return matriculaServiceImp.create(form);
    }

//    @GetMapping
//    public List<Matricula> getAll() {
//        return matriculaServiceImp.getAll();
//    }

    @GetMapping
    public List<Matricula> getAllAlunosByBairro(@RequestParam(value = "bairro", required = false)
                                                           String bairro) {
        return matriculaServiceImp.getAllAlunosByBairro(bairro);
    }

}
