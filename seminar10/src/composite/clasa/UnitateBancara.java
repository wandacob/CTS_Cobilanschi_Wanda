package composite.clasa;

public interface UnitateBancara {
    void adaugaUnitate(UnitateBancara unitateBancara);
    void stergeUnitate(UnitateBancara unitateBancara);
    UnitateBancara getUnitate(int index);

    void descriere(String indentare);
}