package ar.edu.unju.fi.tp4.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component("clienteObj")
public class Cliente {
	private String tipoDocumento;
	private int nroDocumento;
	private String nombreApellido;
	private String email;
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	private int edad;
	private int codigoAreaTelefono;
	private int nroTelefono;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaUltimaCompra;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Cliente(String tipoDocumento, int nroDocumento, String nombreApellido, String email, String password,
			LocalDate fechaNacimiento, int codigoAreaTelefono, int nroTelefono, LocalDate fechaUltimaCompra) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoAreaTelefono = codigoAreaTelefono;
		this.nroTelefono = nroTelefono;
		this.fechaUltimaCompra = fechaUltimaCompra;
	}


	

	public String getTipoDocumento() {
		return tipoDocumento;
	}




	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}




	public int getNroDocumento() {
		return nroDocumento;
	}




	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}




	public String getNombreApellido() {
		return nombreApellido;
	}




	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}




	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}




	public int getCodigoAreaTelefono() {
		return codigoAreaTelefono;
	}




	public void setCodigoAreaTelefono(int codigoAreaTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
	}




	public int getNroTelefono() {
		return nroTelefono;
	}




	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}




	public LocalDate getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}




	public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	
	
	

	@Override
	public String toString() {
		return "Cliente [tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento + ", nombreApellido="
				+ nombreApellido + ", email=" + email + ", password=" + password + ", fechaNacimiento="
				+ fechaNacimiento + ", edad=" + edad + ", codigoAreaTelefono=" + codigoAreaTelefono + ", nroTelefono="
				+ nroTelefono + ", fechaUltimaCompra=" + fechaUltimaCompra + "]";
	}




	public int getEdad() {
		
	    edad = 0;
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, hoy);
		edad = periodo.getYears();
			return edad;
		}
	
	public String getTiempoDesdeUltimaCompra(){
		LocalDate hoy = LocalDate.now();
		LocalDate fechaInicial=this.fechaUltimaCompra;
		LocalDate fechaFinal=hoy;
		Period periodo = Period.between(fechaInicial, fechaFinal);
		String fecha = " A??o:" + periodo.getYears() + " a??os / Mes:" + periodo.getMonths() + " meses / Dia:" + periodo.getDays() + " dias";
		
		return "Tiempo desde Ultima compra : "+fecha;
	}
	
	public String getDiasDesdeMiNacimiento() {
		long diashhoy =0;
		LocalDate hoy = LocalDate.now();
		diashhoy= ChronoUnit.DAYS.between(fechaNacimiento, hoy);
		return "Dias desde mi Nacimiento hasta hoy : " + diashhoy + " dias";
	}

	public String getTiempoCumple() {
		String texto = "";
		LocalDate hoy = LocalDate.now();
		LocalDate proxCump = this.fechaNacimiento.withYear(hoy.getYear());
			if (proxCump.isBefore(hoy) || proxCump.isEqual(hoy)) {
				proxCump = proxCump.plusYears(1);
			}

		Period periodo = Period.between(hoy, proxCump);

		texto = " A??o: " + String.valueOf(periodo.getYears()) + " a??os/ Mes : " + String.valueOf(periodo.getMonths()) + String.valueOf( " meses / Dia : " + periodo.getDays())+ " dias" ;

		LocalDateTime CumpleAhora = LocalDateTime.now();
		LocalDateTime HastaCumpleEnHora = LocalDateTime.of(proxCump.getYear(), proxCump.getMonth(),
				proxCump.getDayOfMonth(), 0, 0, 0);

		Duration duracion = Duration.between(CumpleAhora, HastaCumpleEnHora);

		texto = texto + " / Hora: " + String.valueOf(duracion.toHoursPart()) + " horas / Min : "+ String.valueOf(duracion.toMinutesPart()) + "minutos / Seg : " + String.valueOf(duracion.toSecondsPart())+" segundos";

		return "Tiempo hasta proximo cump: "+texto;

	}
	
}
