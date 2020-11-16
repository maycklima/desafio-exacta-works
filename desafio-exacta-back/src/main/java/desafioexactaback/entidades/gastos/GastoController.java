package desafioexactaback.entidades.gastos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
public class GastoController {

    @Autowired
    GastoService gastoService;

    @GetMapping
    public List<Gasto> bustarTodos() {
        return gastoService.buscarTodos();
    };

    @GetMapping("/{gastoId}")
    public Gasto bustarPorId(@PathVariable Long gastoId){
        return gastoService.buscarPorid(gastoId);
    };

    @PostMapping
    public Gasto salvar(@RequestBody Gasto gasto){
        return gastoService.salvar(gasto);
    };

    @DeleteMapping("/{gastoId}")
    public void remover(@PathVariable Long gastoId){
        gastoService.remover(gastoId);
    };

}
