/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa3;

/**
 *
 * @author Unesp
 */
public class Chacara {
    // ATRIBUTOS
    private String nome;
    private String endereco;
    private float tamFrente;
    private float tamLateral;
    private float areaConstruida;
    // CONSTRUTOR
    public Chacara(){
        
    }
    // METODOS (são as propriedades interativas dos objetos da classe)
    public void setNome(String n){
        nome = n;
    }
    public void setEndereco(String e){
        endereco = e;
    }
    public void setTamFrente(float f){
        tamFrente = f;
    }
    public void setTamLateral(float l){
        tamLateral = l;
    }
    public void setAreaConstruida(float c){
        areaConstruida = c;
    }
    public float getAreaTotal(){
        return (tamFrente*tamLateral);
    }
}
