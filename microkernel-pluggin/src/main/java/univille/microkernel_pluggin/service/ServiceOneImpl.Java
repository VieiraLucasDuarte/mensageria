import br.univille.microkernel_kernel.service.DefaultServices;

@Service
public class ServiceOndeImpl implements DefaultService {
    System.out.println("Service ONE");
    return HttpStatus.OK;
}