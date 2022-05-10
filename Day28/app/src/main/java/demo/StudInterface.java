package demo;

public interface StudInterface {
    void save(Student st);
    void update(Student st);
    void delete(Student st);
    void select(Student st);
    Student getStud(int id);   
}
