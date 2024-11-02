package visitor;

public interface CarVisitor {
    void visit ( Honda car );
    void visit ( Nissan car );
    void visit ( Toyota car );
}
