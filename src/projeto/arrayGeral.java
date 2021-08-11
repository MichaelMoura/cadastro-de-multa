/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class arrayGeral implements Interface{
    ArrayList<Motorista> MotoristasCadastrados = new ArrayList<>();
    ArrayList<Veiculo> VeiculosCadastrados = new ArrayList<>();
    ArrayList<Multa> MultaCadastradas = new ArrayList<>();    
    
    @Override
    public Motorista verificarCpf(String cpf) {
        Motorista motorista = null;
        for(Motorista m: MotoristasCadastrados){
            if(cpf.equals(m.getCpf())){
                return m;
            }
        }
        return motorista;
    }
    
    @Override
    public Motorista pegarDados(String cpf) {
       Motorista motorista=null;
       for(Motorista m: MotoristasCadastrados){
           if(cpf.equals(m.getCpf())){
               String nome= m.getNome();
               int idade = m.getIdade();
               Motorista moto = new Motorista(nome, cpf, idade);
               motorista = moto;           
           }
       }
       return motorista;
    }
    
    @Override
    public boolean cadastrarMotorista(Motorista m) {
        MotoristasCadastrados.add(m);
        return true;
    }
    

    @Override
    public boolean cadastrarMoto(Moto m) {
        VeiculosCadastrados.add(m);
        return true;
    }
    
    @Override
    public boolean cadastrarCarro(Carro c){
        VeiculosCadastrados.add(c);
        return true;
    }
    
    @Override
    public boolean cadastrarCaminhao(Caminhao cm) {
        VeiculosCadastrados.add(cm);
        return true;
    }
   
    
    @Override
    public Veiculo verificarPlaca(String placa) {
        Veiculo veiculo = null;
        for(Veiculo v: VeiculosCadastrados){
            if(placa.equals(v.getPlacaVeiculo())){
                return v;
            }
        }
        return veiculo;
    }

    @Override
    public List<Multa> apresentarMotorista() {
        return MultaCadastradas;
    }
    
    private int contarArrayMotorista(){
        String nome="";
        int contador = 0;
        for(Multa m : MultaCadastradas){
            if(!nome.equals(m.getNomeDoMotorista())){
                contador++;
                nome = m.getNomeDoMotorista();
            }
        }
        return contador;
    }

    @Override
    public boolean cadastrarMulta(Multa m) {
        MultaCadastradas.add(m);
        return true;
    }


    @Override
    public Multa consultarCpf(String cpf) {
    Multa multas = null;
        for(Multa m: MultaCadastradas){
            if(cpf.equals(m.getCpfDoMotorista())){
                return m;
            }
        }
        return multas;
    }

    
    
    @Override
    public Multa apresentarArrayMulta(String cpf) {
        Multa multas = null;
        for(Multa m : MultaCadastradas){//m é os dados que eu enviei, motoristasCadstrados é do meu vetor
           if(cpf.equals(m.getCpfDoMotorista())){
            JOptionPane.showMessageDialog(null,"Nome: " + m.getNomeDoMotorista()+
                   "\n CPF: " + m.getCpfDoMotorista() + 
                   "\n Idade: " + m.getIdadeDoMotorista()
                   );
            break;
            }
            
        }
        for(Multa multa : MultaCadastradas){
           if(cpf.equals(multa.getCpfDoMotorista())){
                   JOptionPane.showMessageDialog(null,
                   "\n Veiculo: " + multa.getTipoDoVeiculo() + 
                   "\n Modelo do Veiculo: " + multa.getModeloDoVeiculo() +
                   "\n Placa do Veiculo: " + multa.getPlacaDoVeiculo() + 
                   "\n Valor da Multa: " + multa.getMulta() +
                   "\n Pontuação a tirar da Multa: " + multa.getPontoCarteira()
                   );
               }
            }
        return multas;
    }
    
    @Override
    public Multa calcularMultas(String cpf) {
        Multa multas = null;
        double guardarMulta = 0;
        String nomeMoto="";
        int idade=0;
        double pontoCarteira=0;
        for(Multa m: MultaCadastradas){
            if(cpf.equals(m.getCpfDoMotorista())){
                    nomeMoto = m.getNomeDoMotorista();
                    idade=m.getIdadeDoMotorista();
                    guardarMulta+= m.getMulta(); 
                    pontoCarteira+= m.getPontoCarteira();
            }
        }
        JOptionPane.showMessageDialog(null, "Nome do motorista: "+ nomeMoto + 
        "\n CPF do Motorista: "+cpf+
        "\n Idade do Motorista: "+idade+        
        "\n Pontuação total a tirar da carteira do Motorista: "+pontoCarteira+        
        "\n Valor total das multas a pagar: " + guardarMulta);                
        return multas;
    } 

    @Override
    public Multa valorTotalDasMultas() {
        Multa motorista = null;
        DecimalFormat df = new DecimalFormat("#.000");
        
        int todosMotoristas = contarArrayMotorista();
        double somaMulta=0;
        double somaPontuacao=0;
        for(Multa m:MultaCadastradas){
            somaMulta+=m.getMulta();
            somaPontuacao+=m.getPontoCarteira();
        }
        
        double mediaMulta = somaMulta/todosMotoristas;
        double mediaPontuacao = somaPontuacao/todosMotoristas;

        JOptionPane.showMessageDialog(null, "A media total de Multas é " + df.format(mediaMulta)+
        "\n A media total da pontuação a tirar da carteira é " + df.format(mediaPontuacao));
        
        return motorista;
    }

    
}