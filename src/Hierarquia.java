public abstract class Hierarquia {
    protected IClasse classe;
    protected float baseSkill;
    public Hierarquia(float baseSkill){
        this.baseSkill = baseSkill;
    }

    public void setClasse(IClasse classe) {
        this.classe = classe;
    }

    public void setBaseSkill(float baseSkill) {
        this.baseSkill = baseSkill;
    }

    public abstract float calcularDano();
}
