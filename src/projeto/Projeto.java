/*
    Michael Fernandes de Moura 23378972
    Lucas Santos 23435348
    Lucas Carrasco 24893609
    César Augusto 24749281
    Jefferson Filho 24181161
 */
package projeto;

import javax.swing.JOptionPane;

public class Projeto {
    
    
    
    public static void main(String[] args) {
        Motorista motorista=null;
        
        Carro carro=null;
        Moto moto=null;
        Caminhao caminhao=null;
        Multa infracao=null;
        
        arrayGeral arrayMotorista = new arrayGeral();
        arrayGeral arrayVeiculo = new arrayGeral();
        arrayGeral arrayMulta = new arrayGeral();
        int opcao;
        String usuario, senha,
        
        //motorista
        cpf,nome;int idade;
        
        //automovel
        String placa,modelo; Object veiculo;
        
        //multa
        Double valorMulta, pontoCarteira;
        int quantidade;
        
        
        Object[] veiculos = {
            "Carro",
            "Caminhão",
            "Moto"
        };
        while(true){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção:" + 
                    "\n1 - Motorista" +  
                    "\n2 - Agente" +
                    "\n3 - Gerente" +
                    "\n4 - Sair"));
            switch(opcao){
                case 1:
                    //Motorista
                    cpf = JOptionPane.showInputDialog(null, "Digite o seu CPF: ");
                    
                    if(arrayMulta.consultarCpf(cpf)!=null){
                        arrayMulta.apresentarArrayMulta(cpf);
                        continue;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Não existe cadastro no sistema");
                        continue;
                    }
                case 2:
                    //Agente
                    usuario = JOptionPane.showInputDialog(null, "Digite o seu usuario: ");
                    senha = JOptionPane.showInputDialog(null, "Digite a sua senha: ");
                        if(usuario.equals("agente") && senha.equals("agente")){
                            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção: " + 
                            "\n1 - Cadastro" + 
                            "\n2 - Voltar"));}
                        else{
                            JOptionPane.showMessageDialog(null, "Email ou senha invalidos");
                            continue;
                        }
                            switch(opcao){
                                case 1:
                                    cpf = JOptionPane.showInputDialog(null, "Digite o seu CPF: ");
                                    if(arrayMotorista.verificarCpf(cpf)==null){
                                        nome = JOptionPane.showInputDialog("Digite o nome do motorista: ");
                                        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
                                        
                                        motorista = new Motorista(nome, cpf, idade);
                                        
                                        if(arrayMotorista.cadastrarMotorista(motorista)){
                                            JOptionPane.showMessageDialog(null, "Motorista foi cadastrado");   
                                        }else{
                                            JOptionPane.showMessageDialog(null,"Erro, O motorista não foi cadastrado");
                                            continue;
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null,"Já existe um motorista com esse cpf");
                                        motorista = arrayMotorista.pegarDados(cpf);
                                    }
                                    
                                    placa = JOptionPane.showInputDialog(null, "Digite a placa do veiculo");
                                    
                                    if(arrayVeiculo.verificarPlaca(placa)==null){
                                        
                                        veiculo = JOptionPane.showInputDialog(null,"Escolha o tipo de veiculo: ","Escolha",
                                        JOptionPane.QUESTION_MESSAGE,null,veiculos,veiculos[0]);
                                        
                                        modelo = JOptionPane.showInputDialog(null, "Qual é o modelo do veiculo");
                                        
                                        if(modelo!=null && placa!=null && cpf!=null){
                                            //Carro
                                            if(veiculo=="Carro"){
                                                carro= new Carro((String) veiculo, modelo, placa);
                                                if(arrayVeiculo.cadastrarCarro(carro)==true){
                                                     JOptionPane.showMessageDialog(null, "Veiculo cadastrado");
                                                }else{
                                                JOptionPane.showMessageDialog(null, "Não foi póssivel cadastrar esse motorista");
                                                continue;
                                                }
                                                
                                                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de multas a ser cadastradas"));
        
                                                for(int i=0;i<quantidade;i++){
                                                    valorMulta = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da multa:"));
                                                    pontoCarteira = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a pontução a tirar da carteira"));
                                                    infracao = new Multa(valorMulta, pontoCarteira, carro, motorista);                      
                                                    if(arrayMulta.cadastrarMulta(infracao)){
                                                        JOptionPane.showMessageDialog(null, "A multa foi cadastrada");
                                                    }else{
                                                        JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro da multa");
                                                    }
                                                }
                                            
                                            //Moto
                                            }else if(veiculo=="Moto"){
                                                moto= new Moto((String) veiculo, modelo, placa);
                                                if(arrayVeiculo.cadastrarMoto(moto)==true){
                                                     JOptionPane.showMessageDialog(null, "Veiculo cadastrado");
                                                }else{
                                                JOptionPane.showMessageDialog(null, "Não foi póssivel cadastrar esse motorista");
                                                continue;
                                                }
                                                
                                                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de multas a ser cadastradas"));
        
                                                for(int i=0;i<quantidade;i++){
                                                    valorMulta = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da multa:"));
                                                    pontoCarteira = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a pontução a tirar da carteira"));
                                                    infracao = new Multa(valorMulta, pontoCarteira, moto, motorista);                      
                                                    if(arrayMulta.cadastrarMulta(infracao)){
                                                        JOptionPane.showMessageDialog(null, "A multa foi cadastrada");
                                                        
                                                    }else{
                                                        JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro da multa");
                                                    }
                                                }
                                                
                                            }else if(veiculo=="Caminhão"){
                                                caminhao= new Caminhao((String) veiculo, modelo, placa);
                                                
                                                if(arrayVeiculo.cadastrarCaminhao(caminhao)==true){
                                                     JOptionPane.showMessageDialog(null, "Veiculo cadastrado");
                                                }else{
                                                JOptionPane.showMessageDialog(null, "Não foi póssivel cadastrar esse motorista");
                                                continue;
                                                }
                                                
                                                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de multas a ser cadastradas"));
        
                                                for(int i=0;i<quantidade;i++){
                                                    valorMulta = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da multa:"));
                                                    pontoCarteira = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a pontução a tirar da carteira"));
                                                    infracao = new Multa(valorMulta, pontoCarteira, caminhao, motorista);                      
                                                    if(arrayMulta.cadastrarMulta(infracao)){
                                                        JOptionPane.showMessageDialog(null, "A multa foi cadastrada");
                                                    }else{
                                                        JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro da multa");
                                                    }
                                                }
                                            }
                                        continue;
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Você não preencheu todos os campos de cadastro");
                                            continue;
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null,"Já existe um veiculo com essa placa");
                                        continue;
                                    }     
                            case 2:
                                break;
                        }
                case 3:
                    //gerente
                    
                    usuario = JOptionPane.showInputDialog(null, "Digite o seu usuario");
                    senha = JOptionPane.showInputDialog(null, "Digite a senha");
                    
                    if(!"gerente".equals(usuario) && !"gerente".equals(senha)){
                        JOptionPane.showMessageDialog(null, "Usuario incorreto");
                        continue;
                    }
                    
                    int opcGerente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção:"+
                    "\n 1 - Ver todos os Motoristas cadastrados " + 
                    "\n 2 - Ver a soma das multas de um Motorista " +
                    "\n 3 - Media total do valor das multas cadastradas" + 
                    "\n 4 - Voltar "));
                    
                    switch(opcGerente){
                        case 1:
                            arrayMulta.apresentarMotorista().forEach(m -> {
                            m.imprima();   
                            });
                            continue;
                            
                        case 2:
                            cpf = JOptionPane.showInputDialog(null, "Digite o cpf do motorista: ");
                            if(arrayMulta.consultarCpf(cpf)!=null){
                                arrayMulta.calcularMultas(cpf);
                                continue;
                            }else{
                                JOptionPane.showMessageDialog(null, "Não existe Motorista com esse nome");
                                continue;
                            }
                        case 3: 
                            arrayMulta.valorTotalDasMultas();
                        case 4:
                            continue;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida");
                            continue;
                    }
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
}  
