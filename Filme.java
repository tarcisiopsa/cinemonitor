class Filme{
  private String tituto;
  private int ano;  
  private int tipo;

    public void setTitulo(String t){
      this.titulo = t;
    }
    public void setAno(int a){
      ano = a;
    }
    public void setTipo(int ti){
      tipo = ti;
    }

    public String geTitulo(){
      return titulo;
    }
    public int getAno(){
      return ano;
    }   
    public int getTipo(){
      return tipo;
    }   


}