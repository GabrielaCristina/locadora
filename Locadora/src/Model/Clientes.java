/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Clientes {
       int id;
    String rg,cpf,estado,cidade,cep;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getrg() {
        return rg;
    }

    public void setModelo(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cor) {
        this.cpf = cpf;
    }

    public String getcidade() {
        return cidade;
    }

    public void setcidade(String cidade) {
        this.cidade= cidade;
    }

    public String getestado() {
        return estado;
    }

    public void setestado(String estado) {
        this.estado = estado;
    }    
      public String getcep() {
        return cep;
    }

    public void setcep(String cep) {
        this.cep = cep;
    }    

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setnome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


