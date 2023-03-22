package simple_factory;

//1daca zice ca asigura crearea de obiecte inseamna ca e creation design pattern

public abstract class PersonalSpital {
    private String name;

    public PersonalSpital(String nume){
        this.name=nume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void afiseazaDescriere();
}
