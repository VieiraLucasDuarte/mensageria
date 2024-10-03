import br.univille.microkernel_kernel.service.DefaultServices;

@Service
public class ServiceOndeImpl implements DefaultService {
    System.out.println("Service TWO");
    return HttpStatus.INTERNAL_SERVER_ERRO;
}