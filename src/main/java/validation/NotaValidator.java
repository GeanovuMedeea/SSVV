package validation;
import domain.Nota;

public class NotaValidator implements Validator<Nota> {
    public void validate(Nota nota) throws ValidationException {
        if (nota.getID().getObject1() == null || nota.getID().getObject1().isEmpty()) {
            throw new ValidationException("ID Student invalid! Must be a non-empty String!\n");
        }
        if (nota.getID().getObject2() == null || nota.getID().getObject2().isEmpty()) {
            throw new ValidationException("ID Tema invalid! Must be a non-empty String!\n");
        }
        if (nota.getNota() < 0 || nota.getNota() > 10) {
            throw new ValidationException("Nota invalida! Must be a non-empty String!\n");
        }
        if (nota.getSaptamanaPredare() < 0 || nota.getSaptamanaPredare() > 14) {
            throw new ValidationException("Saptamana de predare invalida! \n");
        }
    }
}
