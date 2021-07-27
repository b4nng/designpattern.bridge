public class Peao extends Hierarquia{
    public Peao(float baseSkill){
        super(baseSkill);
    }

    @Override
    public float calcularDano() {
        return this.baseSkill*this.classe.multiplicador();
    }
}
