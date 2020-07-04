package exam.PaperContext.domain.model;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class PaperId {
    private String id;

    public boolean sameValueAs(PaperId other) {
        return this.id.equals(other.id);
    }

    public static PaperId nextId() {
        return new PaperId(UUID.randomUUID().toString());
    }

}
