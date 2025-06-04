package ar.edu.unlp.info.oo2.rw.model;

public abstract class Robot
{
    String name;
    Arma arma;
    FuenteEnergia fuente;
    FuenteLocomocion locomocion; 
    
    
    public Robot (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void step() {
        this.move();
        this.consumeBattery();
        this.fireArms();
        this.collectArtifacts();
    }
    
    public void setArma(Arma arma)
    {
    	this.arma=arma;
    }
    
    public void setFuenteEnergia(FuenteEnergia fuente)
    {
    	this.fuente=fuente;
    }
    
    public void setFuenteLocomocion(FuenteLocomocion locomocion)
    {
    	this.locomocion=locomocion;
    }
    
    protected String getNombre()
    {
    	return this.name;
    }
    
    public void move()
    {
    	System.out.print(this.getName()+);
    }
    
    public void consumeBattery();
    
    public void fireArms();
    
    public void collectArtifacts() {
        System.out.println("Robot " + this.getName() + " collecting");
    }
    
}
