package Exercicio18;
public class Carro {
    
    //Atributos
    private String modelo;
    private String cor;
    private String placa;
    private float kmrodado;
    private float combustivel;
    private int portas;
    private int ano;
    private int passageiros;
    private int capassageiros;
    private boolean motorista = false;//
    private boolean onoff = false;
    private boolean portasonoff = false;//
    private boolean carmov = false;
    
    //Metodos
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getKmrodado() {
        return kmrodado;
    }
    public void setKmrodado(float kmrodado) {
        this.kmrodado = kmrodado;
    }

    public float getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getCapassageiros() {
        return capassageiros;
    }
    public void setCapassageiros(int capassageiros) {
        this.capassageiros = capassageiros;
    }
    

    void relatorio(){
        
        System.out.println("");
        System.out.println("------------ RELATÓRIO -------------");
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Quilómetros rodados: " + this.kmrodado +"km");
        System.out.println("Combustível: " + this.combustivel + "L");
        System.out.println("Portas: " + this.portas);
        System.out.println("Ano: " + this.ano);
        System.out.println("Capacidade de passageiros: " + this.capassageiros);
        System.out.println("------------------------------------");
        System.out.println("");

    }
    
    public boolean isCarmov() {
        return carmov;
    }
    public void setCarmov(boolean carmov) {
        this.carmov = carmov;
    }
    void movimentar(){
    if(this.onoff == true && this.portasonoff == false && this.motorista == true ){
        System.out.println("O carro está em movimento!");
        this.setCarmov(true);
    }
    else if(this.onoff == false && this.portasonoff == false && this.motorista == true ){
        System.out.println("O carro não pode ser movimentar, pois não há motorista!");
    }
    else if(this.onoff == true && this.portasonoff == true && this.motorista == true ){
        System.out.println("O carro não pode ser movimentar, pois não as portas estão abertas!");
    }
    else{
        System.out.println("O carro não pode se movimentar, verifique se as portas estão abertas, se o carro está ligado e se há um motorista!");
    }
    
}
    void pararcarro(){
        if(this.carmov == true){
           this.setCarmov(false); 
           System.out.println("O carro parou de se movimentar.");
        }
        else{
            System.out.println("Não é possivel parar o carro, pois ele não está em movimento.");
        }
    }

    
    public boolean isPortasonoff() {
        return portasonoff;
    }
    public void setPortasonoff(boolean portasonoff) {
        this.portasonoff = portasonoff;
    }
    void abrirportas(){
        if (carmov == true){
            System.out.println("Não é possivel abrir a porta quando o carro estiver em movimento");
        }
        else if (carmov == false) {
            this.setPortasonoff(true);
            System.out.println("As portas foram abertas.");
        }
    }
    void fecharportas(){
        if(portasonoff == true){
            this.setPortasonoff(false);
        System.out.println("As portas foram fechadas.");
        }
        else{
            System.out.println("As porta já estão fechadas.");
        }
        
    }

    public boolean isOnoff() {
        return onoff;
    }
    public void setOnoff(boolean onoff) {
        this.onoff = onoff;
    }
    void ligarcarro() {
        if(motorista == false){
            System.out.println("Não é possível ligar o carro sem um motorista.");
        }
        else{
            this.setOnoff(true);
            System.out.println("O carro está ligado.");
        }    
    }
    void desligarcarro(){
        if(motorista == false){
            System.out.println("Não é possível desligar o carro sem um motorista.");
        }
        else{
            this.onoff = false;
            System.out.println("O carro foi desligado.");
        }
    }

    public boolean isMotorista() {
        return motorista;
    }
    public void setMotorista(boolean motorista) {
        this.motorista = motorista;
    }
    void entrarmotorista(){
        if(this.portasonoff == true){
             this.setMotorista(true);
             System.out.println("O motorista entrou no carro.");
        }
        else{
            System.out.println("Não é possivel entrar um motorista, pois as portas estão fechadas.");
        }
        
    }
    void sairmotorista(){
        if(carmov == false){
        this.setMotorista(false);
            System.out.println("O motorista saiu do carro.");
    }
        else{
            System.out.println("Não é possível que o motorista saia do quarto enqunto o carro estiver em movimento.");
        }
    } 
    
    void entrarpassageiros(){
    if(this.portasonoff == true && this.onoff == false){
        if(this.capassageiros >= this.passageiros){
            System.out.println("O carro possúi " + passageiros +" passageiros, restão " +(capassageiros-passageiros) + " vagas.");
        }
        else if(this.capassageiros < this.passageiros){
            System.out.println("O carro suporta apenas " + capassageiros + " passageiros," + (passageiros-capassageiros) + " passageiro não entrou no veículo.");
        }
    }
    else if (this.portasonoff == false && this.onoff == false){
        System.out.println("Não é possivél entrar passageiros, pois as portas estão fechadas.");
    }
    else if(carmov == true){
        System.out.println("Não é possível entrar passageiro enquanto o carro estiver em movimento"); 
    }
    else{
        System.out.println("Não é possivél entrar passageiros, pois o carro está em movimento.");
    }
}
    void sairpassageiros(){
        if(carmov == false){
            System.out.println("O passageiro sairam do carro saiu do carro.");
            this.passageiros = 0; 
    }
        else{
            System.out.println("Não é possível sair passageiros enquanto o carro estiver em movimento.");
        }
    
    }
    
}
