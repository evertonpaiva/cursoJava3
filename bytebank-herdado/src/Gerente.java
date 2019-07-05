
public class Gerente extends FuncionarioAutenticavel {	
	
	public double getBonificacao() {
		System.out.println("Bonificacao do gerente");
		return super.getSalario();
	}
	
}
