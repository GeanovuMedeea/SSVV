package validation;
import domain.Tema;

public class TemaValidator implements Validator<Tema> {
    public void validate(Tema tema) throws ValidationException {
        if (tema.getID() == null || tema.getID().isEmpty()) {
            throw new ValidationException("ID invalid! \n");
        }
        if (tema.getDescriere() == null || tema.getDescriere().isEmpty()) {
            throw new ValidationException("Descriere invalida! Must be a non-empty String!\n");
        }
        if (tema.getDeadline() < 1 || tema.getDeadline() > 14 || tema.getDeadline() < tema.getStartline()) {
            throw new ValidationException("Deadline invalid! Must be a non-empty String!\n");
        }
        if (tema.getStartline() < 1 || tema.getStartline() > 14 || tema.getStartline() > tema.getDeadline()) {
            throw new ValidationException("Data de primire invalida! Must be a non-empty String!\n");
        }
    }
}

