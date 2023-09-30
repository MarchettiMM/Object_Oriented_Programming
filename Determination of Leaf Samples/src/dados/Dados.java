/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Unesp
 */
//Varaiveis
public class Dados {
    
    private int amos;   //Inicio das variáveis
    private double R;
    private double G;
    private double B;
    private int esp;    //Fim das variáveis
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    //Construtor
    public Dados(String cons, String dir) throws Exception{ //"throws Exception é criado pelo proprio programa.
    DataSource db = new DataSource(dir);    //DataSource é responsavel por "criar" uma nova base de dados,
    Instances data = db.getDataSet();       //no caso, localizado no dir(diretorio) que o usuário seleciona.
                                            
    
    amos = (Integer.valueOf(cons));     //Informa para o sistema qual amostra sera consultada
    R = ( (double)data.instance(amos-1).value(0));  //Atribui o valor a variavel R
    G = ( (double)data.instance(amos-1).value(1));  //Atribui o valor a variavel G
    B = ( (double)data.instance(amos-1).value(2));  //Atribui o valor a variavel B
    esp = ( (int)data.instance(amos-1).value(3));   //Atribui o valor a variavel esp(especie)
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
     
    
    
    //Set para numero da amostra a ser buscada
    public void setAmos(int a){ 
        amos = a;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Get para retornar os valores extraidos do banco de dados ao usuário
    public int getAmos(){ //Retona o valor da amostra caso necessario
        return amos;
    }
    public float getR(){    //retorna o valor da variavel R(red) consultada no banco de dados
        return (float)R;
    }
    public float getG(){    //retorna o valor da variavel G(green) consultada no banco de dados
        return (float)G;
    }
    public float getB(){    //retorna o valor da variavel B(blue) consultada no banco de dados
        return (float)B;
    }
    public int getEsp(){    //retorna o valor da variavel esp(espécie) consultada no banco de dados
        return esp;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////