package Java.Exercicio18;
public class MainCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        c1.setModelo("Gol");
        c1.setCor("Prata");
        c1.setPlaca("HXB-453");
        c1.setKmrodado(8.5f);
        c1.setCombustivel(10);
        c1.setPortas(4);
        c1.setAno(2008);
        c1.setCapassageiros(4);
        c1.setPassageiros(5);
        
        c1.abrirportas();
        c1.entrarmotorista();
        c1.entrarpassageiros();
        c1.fecharportas();
        c1.ligarcarro();
        c1.movimentar();
        c1.pararcarro();
        
        c1.relatorio();
    
    }
    
}
