package desafioexactaback.entidades.gastos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastoService {

    @Autowired
    GastoRepository gastoRepository;

    public List<Gasto> buscarTodos(){
        return gastoRepository.findAll();
    }

    public Gasto buscarPorid(Long id){
        Optional<Gasto> gasto = gastoRepository.findById(id);

        return gasto.get();
    }

    public Gasto salvar(Gasto gasto){
        return gastoRepository.save(gasto);
    }

    public void remover(Long id){
        Gasto gasto = gastoRepository.findById(id).get();
        gastoRepository.delete(gasto);
    }
}
