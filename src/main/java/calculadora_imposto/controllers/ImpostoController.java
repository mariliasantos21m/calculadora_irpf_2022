package calculadora_imposto.controllers;

import calculadora_imposto.ImpostoDeRenda;
import calculadora_imposto.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ImpostoController {
    Pessoa pessoa= new Pessoa();
    ImpostoDeRenda imposto = new ImpostoDeRenda();

    @GetMapping
    public String showFormImposto(final Model model){
        model.addAttribute("pessoa", pessoa);
        return "index";
    }

    @PostMapping
    public String saveFormImposto(@ModelAttribute Pessoa pessoa) {
        imposto.setTabelaImposto(pessoa.getValorSalario());
        pessoa.setValorFaixa(imposto.arrayFaixa());
        pessoa.setValorImposto(imposto.arrayImposto());
        pessoa.setTotalImposto(imposto.sumArrayImposto());
        pessoa.setTotalFaixa(imposto.sumArrayFaixa());
        return "calculoImposto";
    }
}
