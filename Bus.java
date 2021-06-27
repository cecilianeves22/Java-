//Crie uma classe para um ônibus turístico para levar pessoas de São Paulo até uma cidade turística.
//A classe deve armazenar o local atual, quantidade de paradas, capacidade do ônibus e quantas pessoas estão
//presentes nele. A classe deve também disponibilizar os seguintes métodos: Inicializa (método construtor), Entra (quando entra alguém), Sai (quando alguém desce do ônibus), Parar (o ônibus para de andar) e andar.

//Crie um prgrama que instacie essa classe três vezes, listando suas paradas, quantas pessoas sobem e quantas pessoas descem.
//Dentro do programa, deve ser possível modificar cada um dos atributos do ônibus.

 class Bus {
    String sao_paulo;
    String turismo;
    int quantPessoas;
    int onibus;
    int quantParadas;
    int capacidade_onibus;



    //Método Construtor
    public Bus (int onibus, String sao_paulo, String turismo, int paradas, int capacidade_onibus, int quantPessoas) {
        this.onibus = onibus;
        this.sao_paulo = sao_paulo;
        this.capacidade_onibus = capacidade_onibus;
        this.quantPessoas = quantPessoas;
        this.quantParadas = paradas;
        this.turismo = turismo;

    }

        public int returnOnibus () {
        return onibus;
        }
        
        public int returnParadas () {
            return quantParadas;
        }

        public int returnPessoas() {
            return quantPessoas;
        }
        
        public String returnTurismo () {
            return turismo;
        }

        public String returnSaoPaulo () {
            return sao_paulo;
        }

        public int returnCapacidade () {
            return capacidade_onibus;
        }

       void liga(){
           System.out.println("O ônibus está ligado");
       }
    }
