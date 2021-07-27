public class Sargento extends Hierarquia{
    public Sargento(float baseSkill) {
        super(baseSkill);
    }

    @Override
    public float calcularDano() {
        return this.baseSkill*this.classe.multiplicador()*2;
    }
}
