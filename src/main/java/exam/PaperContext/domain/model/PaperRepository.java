package exam.PaperContext.domain.model;

public interface PaperRepository {

    Paper find(PaperId paperId);

    void save(Paper paper);

    void delete(PaperId paperId);
}
