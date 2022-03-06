package com.alexandrepossari.desafiodeprogramacao.controller;

import com.alexandrepossari.desafiodeprogramacao.questoes.Questao1;
import com.alexandrepossari.desafiodeprogramacao.questoes.Questao2;
import com.alexandrepossari.desafiodeprogramacao.questoes.Questao3;
import com.alexandrepossari.desafiodeprogramacao.requests.Questao1PostRequestBody;
import com.alexandrepossari.desafiodeprogramacao.requests.Questao2PostRequestBody;
import com.alexandrepossari.desafiodeprogramacao.requests.Questao3PostRequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestoesController {
    private final Questao3 questao3;
    private final Questao2 questao2;
    private final Questao1 questao1;

    public QuestoesController(Questao3 questao3, Questao2 questao2, Questao1 questao1) {
        this.questao3 = questao3;
        this.questao2 = questao2;
        this.questao1 = questao1;
    }

    @PostMapping(path = "questao3")
    public ResponseEntity<String> questao3(@RequestBody Questao3PostRequestBody requestBody){
        return ResponseEntity.ok(Questao3.questao3(requestBody.getFrase()));
    }

    @PostMapping(path = "questao2")
    public ResponseEntity<Integer> questao2(@RequestBody Questao2PostRequestBody requestBody){
        return ResponseEntity.ok(Questao2.questao2(requestBody.getX(), requestBody.getArray()));
    }

    @PostMapping(path = "questao1")
    public ResponseEntity<Integer> questao1(@RequestBody Questao1PostRequestBody requestBody){
        return ResponseEntity.ok(Questao1.questao1(requestBody.getArray()));
    }
}
